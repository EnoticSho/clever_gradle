plugins {
    id("java")
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

repositories {
    mavenCentral()
}

tasks.jar {
    manifest {
        attributes["Implementation-Title"] = "Utils"
        attributes["Implementation-Version"] = "1.3.5"
    }
    archiveFileName.set("utils-1.3.5.jar")
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

tasks.test {
    useJUnitPlatform()
}