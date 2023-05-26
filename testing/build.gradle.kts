plugins {
    id("java-library")
    `maven-publish`
}

lateinit var sourcesArtifact: PublishArtifact
lateinit var jarArtifact: PublishArtifact
tasks {
    val sources by creating(Jar::class) {
        archiveClassifier.set("sources")
        from(rootProject.the<SourceSetContainer>()["main"].allSource)
    }

    artifacts {
        sourcesArtifact = add("archives", sources)
    }
    val jarClasses by creating(Jar::class) {
        from(rootProject.components["java"])
    }

    artifacts {
        jarArtifact = add("archives", jarClasses)
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.Minestom"
            artifactId = "minestom"
            version = System.getenv()["GITHUB_BUILD_NUMBER"]
            setArtifacts(listOf(sourcesArtifact, jarArtifact))
        }
    }
    repositories {
        maven {
            name = "Packages"
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