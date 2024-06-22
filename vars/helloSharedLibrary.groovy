
def call() {
  sh "echo Hello YMT, welcome to the shared library learning path. Today is Saturday"
  println("Hello from println")
}

def info(message){
  echo "INFO: $message"
}

def message(info){
  echo "MESSAGE: $info"
}

// example pipeline
// ====================
// @Library("Builders") _
// pipeline {
//     agent any

//     stages {
//         stage('Hello') {
//             steps {
//                 helloSharedLibrary("Yamavaram Manitheja", "Saturday")
//             }
//         }
//     }
// }
// =====================================
