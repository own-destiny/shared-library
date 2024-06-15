def call(Map config = [:]){
  def testScript = libraryResource "scripts/linux/test-script.sh"
  writeFile file: "${config.name}", text: testScript
  sh "chmod +x ./${config.name}"
}
