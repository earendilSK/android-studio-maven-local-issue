# android-studio-maven-local-issue
Library project using maven local to publish artifacts. Application using the artifact from maven local.

Artifact not refreshed in Android Studio 3.1.2 and Android Studio 3.2 Canary 14

Working fine in Android Studio 3.0.1

Android Studio 3.1.2
Build #AI-173.4720617, built on April 13, 2018
JRE: 1.8.0_152-release-1024-b02 amd64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Windows 10 10.0

Steps to reproduce:
1. enter sample-library folder
2. in console run gradlew publishToMavenLocal
4. Import application project to Android Studio
5. Install to device and observe number 1 on screen
6. Back in library project edit sample-library\library\src\main\java\com\android\sample\Test.java > change value to "2"
7. run gradlew publishToMavenLocal again
8. In Android Studio (application project) hit (Refresh all Gradle projects) (does nothing)
9. Inspect version not changed > Project selector > External libraries > com.android.sample:library:1.0.0-SNAPSHOT > com.android.sample.Test
```
package com.android.sample;
public class Test {
    public static final String VALUE = "1";
    public Test() {
    }
}
```
10. Run install again, observe value changed to "2"