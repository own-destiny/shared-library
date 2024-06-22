
def call(testgroovy) {
  sh "echo Hello YMT, welcome to the shared library learning path. Today is Saturday"
  println("Hello from println")
}

def info(message){
  echo "INFO: $message"
}

def message(info){
  echo "MESSAGE: $INFO"
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
