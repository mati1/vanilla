plugins {
    kotlin("android")
    kotlin("kapt")
    id("com.android.library")
    id("kotlin-parcelize")
    id("dagger.hilt.android.plugin")
}

android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
        targetSdk = 32

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
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

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.1.0"
    }
    room {
        schemaLocationDir.set(file("roomSchemas"))
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")


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

    implementation("androidx.room:room-runtime:2.4.2")
    implementation("androidx.room:room-ktx:2.4.2")
    annotationProcessor("androidx.room:room-compiler:2.4.2")
    kapt("androidx.room:room-compiler:2.4.2")
}