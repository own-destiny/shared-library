def call(Map config = [:]){
  def testScripts = libraryResource "scripts/linux/test-script.sh"
  writeFile file: "${config.name}", text: testScripts
  sh "chmod a+x ./${config.name}"
}
