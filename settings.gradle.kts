pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()

        // ==== 百度Maven仓库 ====
        maven {
            url = uri("https://api.map.baidu.com/repository/maven-public/")
            isAllowInsecureProtocol = true
        }

        // ==== 新增JitPack仓库（用于Glide） ====
        maven {
            url = uri("https://www.jitpack.io")
        }
    }
}

rootProject.name = "AssignmentThree"
include(":app")
