plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
   id( "de.mannodermaus.android-junit5")
}

android {
    namespace = "com.example.learningtestwithmitch"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.learningtestwithmitch"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation("androidx.test:core:1.5.0")
    androidTestImplementation("androidx.test:runner:1.5.2")
    androidTestImplementation("androidx.arch.core:core-testing:2.2.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.3")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.3")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.3")
    testImplementation("org.mockito:mockito-core:5.4.0")

    implementation("com.google.dagger:dagger:2.46.1")
    annotationProcessor("com.google.dagger:dagger-compiler:2.46.1")
    implementation("com.google.dagger:dagger-android:2.22")
    implementation("com.google.dagger:dagger-android-support:2.22")
    annotationProcessor("com.google.dagger:dagger-android-processor:2.22")

    implementation("com.google.android.material:material:1.10.0")

    implementation("androidx.room:room-runtime:2.6.0")
    annotationProcessor("androidx.room:room-compiler:2.6.0")
    implementation("androidx.room:room-rxjava2:2.6.0")

    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")

    implementation("android.arch.lifecycle:reactivestreams:1.1.1")

    implementation("io.reactivex.rxjava2:rxjava:2.2.21")

    implementation("io.reactivex.rxjava2:rxandroid:2.1.1")

    implementation("com.squareup.retrofit2:adapter-rxjava2:2.6.3")
}