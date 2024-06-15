def call (){
  def testScript = libraryResource 'scripts/linux/test-script.sh'
  sh "echo $testScript"
  // sh './test-script.sh manitheja saturday'
}
