// def call() {
//   sh "echo Hello YMT, welcome to the shared library learning path. Today is Saturday"
// }
// ================
// example pipeline:2
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
//Example:2 below examples allow us to pass the values dynamically. Excluding positionsl parameter.
// def call(String name, String dayOfTheWeek) {
//   sh "echo Hello ${name}, welcome to the shared library learning path. Today is ${dayOfTheWeek}"
// }
// ================
// example pipeline:2
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
// =================================
// pass the values dynamically by using Map keyword and more robust excluding positional parameters.

def call(Map config = [:]) {
  sh "echo Hello ${config.name}, welcome to the shared library learning path. Today is ${config.dayOfTheWeek}."
}

