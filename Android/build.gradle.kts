//Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    // Remove or update this line if 'kotlin.compose' is not defined in your libs.versions.toml
    // alias(libs.plugins.kotlin.compose) apply false
}