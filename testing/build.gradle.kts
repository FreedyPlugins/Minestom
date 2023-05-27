plugins {
    id("java-library")
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.Minestom"
            artifactId = "minestom"
            version = System.getenv()["GITHUB_BUILD_NUMBER"]
            val artifactList = ArrayList<PublishArtifact>()
            File("build/libs/").listFiles { file, s -> s.endsWith(".jar") }
                    ?.forEach { artifacts { artifactList.add(add("archives", it)) } }
                    tasks {
                        artifacts {
                            add("archives", create("sources-archives", Jar::class) {
                                from(rootProject.the<SourceSetContainer>()["Main"].allSource)
                            }).let { artifactList.add(it) }
                        }
                    }
            setArtifacts(artifactList)
        }
    }
    repositories {
        maven {
            name = "Packages"
//            url = uri("/Users/ijong-won/IdeaProjects/Minestom/published")
            url = uri("https://maven.pkg.github.com/%s".format(System.getenv()["GITHUB_REPOSITORY"]))
            credentials {
                this.username = System.getenv()["GITHUB_REPOSITORY"]?.split("/")?.get(0)
                this.password = System.getenv()["GITHUB_TOKEN"]
            }
        }
    }
}

group = "net.minestom.testing"
version = "1.0"

repositories {
    mavenCentral()
    maven(url = "https://jitpack.io")
}

dependencies {
    // Minestom API
    api(project(mapOf("path" to ":")))
    // Junit Testing Framework
    api(libs.junit.api)
    api(libs.junit.params)
    api(libs.junit.suite.api)
    runtimeOnly(libs.junit.engine)
    runtimeOnly(libs.junit.suite.engine)
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}