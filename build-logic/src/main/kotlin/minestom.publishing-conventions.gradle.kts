plugins {
    id("net.kyori.indra")
    id("net.kyori.indra.publishing")
}

indra {
    javaVersions {
        target(17)
        testWith(17)
    }

    github("Minestom", "Minestom") {
        ci(true)
        publishing()
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
