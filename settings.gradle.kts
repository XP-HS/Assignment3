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
        // ==== 添加百度Maven仓库 ====
        maven {
            url = uri("https://api.map.baidu.com/repository/maven-public/")
        }
    }
}

rootProject.name = "AssignmentThree"
include(":app")
 