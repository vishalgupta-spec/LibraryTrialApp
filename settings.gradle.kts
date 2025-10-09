pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "LibraryTrialApp"

include(":librarytrial")

// Exclude app during JitPack build
if (System.getenv("JITPACK") == null) {
    include(":app")
}
