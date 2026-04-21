plugins {
    java
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:6.0.3")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:6.0.3")
    implementation("org.scala-lang:scala3-library_3:3.8.3")
    testImplementation("org.scalatest:scalatest_3:3.2.20")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<ScalaCompile>().configureEach {
    scalaCompileOptions.additionalParameters = listOf(
        "-Xunchecked-java-output-version",
        JavaVersion.current().majorVersion,
    )
}
