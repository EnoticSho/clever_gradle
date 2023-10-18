plugins {
    id("jacoco")
}

dependencies {
    implementation(files("libs/utils-1.3.5.jar"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
}

tasks.test {
    useJUnitPlatform()
    finalizedBy("jacocoTestReport")
}