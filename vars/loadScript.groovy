def call(Map config = [:]){
  def testscripts = libraryResource "scripts/linux/test-script.sh"
  writeFile file: "${config.name}", text: testscripts
  sh "chmod a+x ./${config.name}"
}
