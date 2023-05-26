import net.kyori.indra.IndraExtension

plugins {
    id("net.kyori.indra")
    id("net.kyori.indra.publishing")
    id("net.kyori.indra.publishing.sonatype")
}

fun IndraExtension.setupCredential() {
    val SONATYPE_USERNAME: String? by System.getenv()
    val SONATYPE_PASSWORD: String? by System.getenv()
    publishReleasesTo(
            SONATYPE_USERNAME ?: return,
            SONATYPE_PASSWORD ?: return
    )
}

indra {
    setupCredential()

    javaVersions {
        target(17)
        testWith(17)
    }

    github("Minestom", "Minestom") {
        ci(true)
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
