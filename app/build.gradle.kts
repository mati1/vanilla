plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("kapt")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.mati1.vanilla"
        minSdk = 23
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true

            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    testOptions.unitTests {
        isIncludeAndroidResources = true

        all(Test::useJUnitPlatform)
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.0"
    }

    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }

}

dependencies {
    implementation(project(":library"))
    implementation(project(":shopping"))

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("androidx.fragment:fragment-ktx:1.4.1")
    debugImplementation("androidx.fragment:fragment-testing:1.4.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.3")

    implementation("com.google.android.material:material:1.5.0")

    implementation(libs.bundles.compose)

    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.1")

    implementation("androidx.activity:activity-compose:1.4.0")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.0")
    testImplementation("org.robolectric:robolectric:4.7.3")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")

//    implementation(libs.dagger.android)
//    implementation(libs.dagger.android.support)
//    kapt(libs.dagger.compiler)
//    kapt(libs.dagger.android.processor)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    debugImplementation("androidx.compose.ui:ui-tooling:1.1.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:1.1.0")
}
