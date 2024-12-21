plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.newsprojectpractice"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsprojectpractice"
        minSdk = 28
        //noinspection OldTargetApi
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    buildFeatures{
        viewBinding = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx.v1120)
    implementation(libs.androidx.appcompat.v161)
    implementation(libs.material.v1100)
    implementation(libs.androidx.constraintlayout.v214)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit.v115)
    androidTestImplementation(libs.androidx.espresso.core.v351)

    // Architectural Components
    implementation (libs.androidx.lifecycle.viewmodel.ktx)

    // Room
    implementation (libs.androidx.room.runtime.v260)
    ksp (libs.androidx.room.compiler.v260)

    // Kotlin Extensions and Coroutines support for Room
    implementation (libs.androidx.room.ktx.v260)

    // Coroutines
    implementation (libs.kotlinx.coroutines.core.v171)
    implementation (libs.kotlinx.coroutines.android.v171)

    // Coroutine Lifecycle Scopes
    implementation (libs.androidx.lifecycle.viewmodel.ktx)
    implementation (libs.androidx.lifecycle.runtime.ktx.v287)

    // Retrofit
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
    implementation (libs.logging.interceptor)

    // Navigation Components
    implementation (libs.androidx.navigation.fragment.ktx.v285)
    implementation (libs.androidx.navigation.ui.ktx.v285)

    // Glide
    implementation (libs.glide.v4120)
    ksp (libs.compiler)
}
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}
