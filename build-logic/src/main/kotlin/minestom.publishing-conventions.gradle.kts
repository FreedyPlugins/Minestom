
plugins {
    id("net.kyori.indra")
    id("net.kyori.indra.publishing")
}


indra {
    configurePublications {
    }
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
