plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.openjfx.javafxplugin") version "0.0.9"
    id("application")
}

javafx {
    version = "15.0.1"
    modules = mutableListOf("javafx.controls", "javafx.graphics", "javafx.web")
}

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("https://jitpack.io") }
}

application {
    mainClassName = "io.ygdrasil.delaunator.ui.FXAppKt"
}

dependencies {
    implementation(rootProject)
}


tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
        jvmTarget = "11"
    }
}