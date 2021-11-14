import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar

plugins {
    kotlin("jvm") version "1.5.30"
    id("application")
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

version = "0.0.1"
java.sourceCompatibility = JavaVersion.VERSION_16

application {
    mainClass.set("hu.advent.of.code.ApplicationKt")
}

tasks {
    named<ShadowJar>("shadowJar") {
        minimize()
    }
}

repositories {
    jcenter()
    mavenCentral()
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.github.microutils:kotlin-logging-jvm:2.0.11")
    implementation("ch.qos.logback:logback-classic:1.2.6")

    testImplementation(kotlin("test"))
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "16"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}