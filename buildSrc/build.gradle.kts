repositories {
    mavenCentral()
    google()
}

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.kgp)
    implementation(libs.agp)
    implementation(libs.hilt.android.plugin)
}
