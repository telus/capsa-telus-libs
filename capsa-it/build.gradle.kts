dependencies {
    implementation("ch.qos.logback:logback-classic")
    implementation("com.fasterxml.jackson.core:jackson-databind")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.github.tomakehurst:wiremock-jre8")
    implementation("com.google.guava:guava")
    implementation("com.sun.xml.bind:jaxb-core")
    implementation("com.willowtreeapps.assertk:assertk-jvm")
    implementation("javax.xml.bind:jaxb-api")
    implementation("org.apache.commons:commons-lang3")
    implementation("org.apache.httpcomponents:httpclient")
    implementation("org.apache.httpcomponents:httpmime")
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime")
    implementation("org.jetbrains.kotlin:kotlin-script-util")
    implementation("org.jetbrains.kotlin:kotlin-scripting-compiler-embeddable")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-test")
    implementation("org.junit.platform:junit-platform-launcher")
    implementation("org.mockito:mockito-core")
    implementation("org.springframework.boot:spring-boot-starter-data-rest")
    implementation("org.springframework.boot:spring-boot-starter-test")
    implementation("org.springframework.boot:spring-boot-starter-mail")
    implementation("org.springframework.integration:spring-integration-mail")
    implementation("org.springframework.ws:spring-ws-core")
    implementation("org.springframework:spring-context")
    implementation(project(":capsa-core"))
}
