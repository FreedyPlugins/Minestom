
import gradle.kotlin.dsl.accessors._6e76eda3e9f361c84676b4951885a653.indra

plugins {
    id("net.kyori.indra")
    id("net.kyori.indra.publishing")
}

lateinit var sourcesArtifact: PublishArtifact
tasks {
    val sourcesJar by creating(Jar::class) {
        archiveClassifier.set("sources")
        from(project.the<SourceSetContainer>()["main"].allSource)
    }

    artifacts {
        sourcesArtifact = add("archives", sourcesJar)
    }
}

indra {
    configurePublications {
        from(components["java"])
        artifact(sourcesArtifact)
    }
    javaVersions {
        target(17)
        testWith(17)
    }
    runCatching {
        val split = System.getenv()["GITHUB_REPOSITORY"]?.split("/") ?: throw AssertionError()
        val username = split[0]
        val password = split[1]
        println("$username/$password")
        github(username, password) {
            ci(true)
            publishing()
        }
    }
    apache2License()

    configurePublications {
        pom {
            developers {
                developer {
                    id.set("TheMode")
                    name.set("TheMode")
                }
                developer {
                    id.set("jglrxavpok")
                    name.set("jglrxavpok")
                }
            }
        }
    }
}
