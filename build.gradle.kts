import com.android.build.gradle.api.AndroidBasePlugin

plugins {
    alias(libs.plugins.gradle.cache.fix) apply false
    alias(libs.plugins.kover)
}

subprojects {
    plugins.withType<AndroidBasePlugin> {
        apply(plugin = "org.gradle.android.cache-fix")
    }
}

repositories {
    google()
    mavenCentral()
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}
