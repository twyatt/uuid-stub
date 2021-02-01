plugins {
    kotlin("multiplatform")
    `maven-publish`
}

/* ```
 *   common
 *   |-- js
 *   |-- jvm
 *   '-- apple
 *       |-- ios
 *       '-- macos
 * ```
 */
kotlin {
    js().browser()
    jvm()
    iosX64()
    iosArm64()
    macosX64()

    sourceSets {
        val commonMain by getting

        val appleMain by creating {
            dependsOn(commonMain)
        }

        val iosX64Main by getting {
            dependsOn(appleMain)
        }

        val iosArm64Main by getting {
            dependsOn(appleMain)
        }

        val macosX64Main by getting {
            dependsOn(appleMain)
        }
    }
}
