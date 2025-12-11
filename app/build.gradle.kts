plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.assignmentthree"
    compileSdk = 36  // ✅ 更新为36，与插件版本匹配

    defaultConfig {
        applicationId = "com.example.assignmentthree"
        minSdk = 24
        targetSdk = 36  // ✅ 更新为36，与compileSdk保持一致
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)  // ✅ 现在兼容了
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)

    // 暂时注释掉百度地图依赖（先解决基础问题）
    // implementation("com.baidu.lbsyun:BaiduMapSDK_Map:7.5.9")
    // implementation("com.baidu.lbsyun:BaiduMapSDK_Location:7.5.9")
    // implementation("com.baidu.lbsyun:BaiduMapSDK_Search:7.5.9")
    // implementation("com.baidu.lbsyun:BaiduMapSDK_Util:7.5.9")

    //implementation("com.baidu.lbsyun:BaiduMapSDK_Map:7.5.+")
    //implementation("com.baidu.lbsyun:BaiduMapSDK_Location:7.5.+")
    //implementation("com.baidu.lbsyun:BaiduMapSDK_Search:7.5.+")
    //implementation("com.baidu.lbsyun:BaiduMapSDK_Util:7.5.+")

    //implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    //implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")


    implementation("com.android.volley:volley:1.2.1")
    implementation("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.16.0")
}