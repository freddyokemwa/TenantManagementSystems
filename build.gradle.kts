plugins {
    alias(libs.plugins.android.application) apply false

    // Makes the Safe Args plugin available to the app.
    id("androidx.navigation.safeargs.kotlin") version "2.9.8" apply false
}