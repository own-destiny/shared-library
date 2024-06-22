
def call(String name = 'Manitheja', String day = 'Saturday') {
  sh "echo Hello $name, welcome to the shared library learning path. Today is $day"
  println("Hello $name from println")
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
