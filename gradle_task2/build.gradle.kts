subprojects {
    apply(plugin = "java")

    extensions.getByType<JavaPluginExtension>().apply {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    repositories {
        mavenCentral()
    }
}
