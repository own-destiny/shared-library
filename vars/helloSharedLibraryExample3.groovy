def call(Map config = [:]) {
  // its just a map and positions do not matter at this point
  sh "echo Hello ${config.name}, welcome to the shared library learning path. Today is ${config.dayOfTheWeek}."
}
