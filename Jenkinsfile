// @Library("Builders") _
pipeline{
    // agent any
    agent {
        docker { image 'node:16-alpine' }
    }
    stages{
        stage("script"){
            steps{
                // hellowExternal()
                // hellowExternal(name: "manitheja", dayOfTheWeek: "Saturday")
                sh 'node --version'
                helloSharedLibrary()
                helloSharedLibrary.info("Hello from info")
                helloSharedLibrary.message("hello from message")
            }
        }
    }
}
