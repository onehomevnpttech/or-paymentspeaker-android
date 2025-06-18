plugins {
    id("com.android.library")
    id("maven-publish")
}

android {
    namespace = "vn.vnpt.oneretail.payment_speaker"
    compileSdk = 35
    defaultConfig {
        minSdk = 24
    }
}

dependencies {
    // nếu cần flutter_embedding, add tại đây
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "vn.vnpt.oneretail"
            artifactId = "payment_speaker"
            version = "1.0.0-web"

            artifact(file("libs/ORPaymentSpeakerWeb.aar"))
//            artifact(file("pom.xml"))
        }
    }
}
