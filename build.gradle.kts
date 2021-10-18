// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins{
//    id("com.github.ben-manes.versions")
    id("com.dipien.releaseshub.gradle.plugin") version "3.1.0"
}
buildscript {
    repositories {
        google()
        jcenter()

    }
    dependencies {
        classpath("com.android.tools.build:gradle:4.1.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}")
//        classpath("com.github.ben-manes:gradle-versions-plugin:0.33.0")
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}

releasesHub {
    dependenciesClassNames = listOf("Dependencies.kt")
    dependenciesBasePath = "buildSrc/src/main/java/"
    gitHubRepositoryOwner = "savvisingh"
    gitHubRepositoryName = "coil-sample"
}

apply from: 'dependencies.gradle'

