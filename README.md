Dependency resolution issue:

Steps to reproduce.

1. Clone repository
2. Import project from root build.gradle file
3. Create a java application run configuration with main class base.DependencyTest from the javaproject module
3. Run the run run configuration in IDEA or run `./gradlew javaproject:run`

Note the gradle tool window (via view > tool windows > gradle) displays the correct dependencies under the javaproject module's dependency
Note in Project structure, there are no facets, and all dependencies are valid for javaproject module


4. Uncomment in settings.gradle to introduce the android submodule.
5. Run a gradle sync in the IDE

Note in gradle tool windows, dependencies are no longer listed
Note in Project structure, android facets have been applied to all modules
Note in project structure all dependencies in javamodule are set as "provided" only

6. Try to run the existing run configuration for javaproject. Dependencies are missing on classpath as they are only provided scope.
7. Run the `./gradlew javaproject:run` task, or use the drop down from the gradle tool window to run through Gradle just fine.



Latest IDEA version tested on:

IntelliJ IDEA 2018.1.1 (Community Edition)
Build #IC-181.4445.20, built on April 2, 2018
JRE: 1.8.0_152-release-1136-b27 amd64
JVM: OpenJDK 64-Bit Server VM by JetBrains s.r.o
Linux 4.15.15-1-ARCH