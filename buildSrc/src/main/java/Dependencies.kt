object Coroutines {
    private const val coroutinesVer = "1.4.1"
    private const val flowTestingVer = "0.4.0"
    const val CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVer"
    const val PLAY_SERVICES = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:$coroutinesVer"
    const val ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVer"
    const val COROUTINES_RX = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:$coroutinesVer"

    const val TESTING = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$coroutinesVer"
    const val FLOW_TESTING = "app.cash.turbine:turbine:$flowTestingVer"
}

object Versions {
    const val KOTLIN = "1.3.72"
    const val CORE_KTX = "1.3.0"
    const val JUNIT = "4.12"
    const val JUNIT_EXT = "1.1.1"
    const val ESPRESSO_CORE = "3.2.0"
    const val RX_JAVA = "2.2.10"
    const val RX_ANDROID = "2.1.1"
    const val KOIN = "2.2.0"
    const val MAPS = "17.0.0"
    const val TIMBER = "4.7.1"
    const val FACEBOOK_SDK = "5.2.0"
    const val FIREBASE_AUTH = "19.3.0"
    const val MOSHI = "1.6.0"
    const val TRUTH = "1.0"
    const val JACOCO = "0.8.4"
}

object LibAndroidx {
    private const val appCompatVer = "1.1.0"
    private const val recyclerViewVer = "1.1.0-beta01"
    private const val constraintLayoutVer = "2.0.0-beta4"
    private const val lifeCycleExtensionsVer = "2.2.0"
    private const val materialVer = "1.1.0"
    private const val lifecycleCompilerVer = "2.2.0"
    private const val annotationVer = "1.1.0"
    private const val coordinatorVer = "1.1.0"
    private const val legacySupportVer = "1.0.0"
    private const val roomVer = "2.2.5"
    private const val preferenceVer = "1.1.0-rc01"
    private const val workVer = "2.3.4"
    private const val activityVer = "1.2.0-beta02"
    private const val fragmentVer = "1.3.0-beta02"
    private const val paging2Ver = "2.1.2"
    private const val coreTesting = "2.1.0"
    private const val swipeRefreshVer = "1.1.0"
    private const val transitionVer = "1.3.1"
    private const val orchestratorVer = "1.2.0"

    const val ANDROIDX_FRAGMENT = "androidx.fragment:fragment:$fragmentVer"
    const val ANDROIDX_FRAGMENT_KTX = "androidx.fragment:fragment-ktx:$fragmentVer"
    const val ANDROIDX_ACTIVITY = "androidx.activity:activity:$activityVer"
    const val ANDROIDX_ACTIVITY_KTX = "androidx.activity:activity-ktx:$activityVer"
    const val ANDROIDX_CORE_KTX = "androidx.core:core-ktx:${Versions.CORE_KTX}"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:$appCompatVer"
    const val ANDROIDX_RECYCLER_VIEW = "androidx.recyclerview:recyclerview:$recyclerViewVer"
    const val ANDROIDX_CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:$constraintLayoutVer"
    const val ANDROIDX_LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:$lifeCycleExtensionsVer"
    const val ANDROIDX_LIFECYCLE_VIEWMODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifeCycleExtensionsVer"
    const val ANDROIDX_LIFECYCLE_LIVEDATA = "androidx.lifecycle:lifecycle-livedata-ktx:$lifeCycleExtensionsVer"
    const val ANDROIDX_LIFECYCLE_JAVA8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycleCompilerVer"
    const val ANDROIDX_MATERIAL = "com.google.android.material:material:$materialVer"
    const val ANDROIDX_SWIPE_REFRESH = "androidx.swiperefreshlayout:swiperefreshlayout:$swipeRefreshVer"
    const val ANDROIDX_ANNOTATION = "androidx.annotation:annotation:$annotationVer"
    const val ANDROIDX_COORDINATOR_LAYOUT = "androidx.coordinatorlayout:coordinatorlayout:$coordinatorVer"
    const val ANDROIDX_LEGACY_SUPPORT = "androidx.legacy:legacy-support-v4:$legacySupportVer"
    const val ANDROIDX_PREFERENCES = "androidx.preference:preference:$preferenceVer"
    const val ANDROIDX_WORK_RUNTIME = "androidx.work:work-runtime-ktx:$workVer"
    const val ANDROIDX_WORK_RXJAVA = "androidx.work:work-rxjava2:$workVer"
    const val ANDROIDX_WORK_TESTING = "androidx.work:work-testing:$workVer"
    const val ANDROIDX_PAGING_2_RUNTIME = "androidx.paging:paging-runtime-ktx:$paging2Ver"
    const val ANDROIDX_PAGING_2_COMMON = "androidx.paging:paging-common-ktx:$paging2Ver"
    const val ANDROIDX_PAGING_2_RXJAVA = "androidx.paging:paging-rxjava2-ktx:$paging2Ver"
    const val ANDROIDX_TRANSITION = "androidx.transition:transition:$transitionVer"

    const val ANDROIDX_ROOM_COMPILER = "androidx.room:room-compiler:$roomVer"
    const val ANDROIDX_ROOM_RUNTIME = "androidx.room:room-runtime:$roomVer"
    const val ANDROIDX_RX_JAVA = "androidx.room:room-rxjava2:$roomVer"
    const val ANDROIDX_ROOM_TESTING = "androidx.room:room-testing:$roomVer"

    const val ANDROIDX_CORE_TESTING = "androidx.arch.core:core-testing:$coreTesting"
    const val ANDROIDX_ORCHESTRATOR = "androidx.test:orchestrator:$orchestratorVer"
}