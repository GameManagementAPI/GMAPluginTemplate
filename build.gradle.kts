plugins {
    kotlin("jvm") version "1.9.23"
    id("io.papermc.paperweight.userdev") version "1.7.4"
    id("xyz.jpenilla.run-paper") version "2.3.0" // Adds runServer tasks for testing
}

group = "de.c4vxl"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(files("libs/GameManager.jar"))

    paperweight.paperDevBundle("1.19-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.23")
    implementation("dev.jorel", "commandapi-bukkit-shade", "9.5.3")
    implementation("dev.jorel", "commandapi-bukkit-kotlin", "9.5.3")
}

kotlin {
    jvmToolchain(17)
}

tasks {
    assemble {
        dependsOn(reobfJar)
    }
    compileJava {
        options.encoding = "UTF-8"
        options.release.set(17)
    }
    compileKotlin {
        kotlinOptions.jvmTarget = "17"
    }
    jar {
        archiveFileName.set("GMAPlugin.jar")
    }
}
