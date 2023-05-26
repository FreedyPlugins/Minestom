plugins {
    id("java-library")
    `maven-publish`
}

lateinit var sourcesArtifact: PublishArtifact
lateinit var jarArtifact: PublishArtifact
tasks {
    val sources by creating(Jar::class) {
        archiveClassifier.set("sources")
        from(project.the<SourceSetContainer>()["main"].allSource)
    }

    artifacts {
        sourcesArtifact = add("archives", sources)
    }
    val jarClasses by creating(Jar::class) {
        from(project.the<SourceSetContainer>()["main"].allJava)
    }

    artifacts {
        jarArtifact = add("archives", jarClasses)
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            setArtifacts(listOf(sourcesArtifact, jarArtifact))
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/%s".format(System.getenv()["GITHUB_REPOSITORY"]))
            credentials {
                this.username = username
                this.password = password
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