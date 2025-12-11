plugins {
    id("com.android.application") version "8.9.1" apply false  // ✅ 更新到8.9.1
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
