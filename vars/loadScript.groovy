def call(Map config = [:]){
  def testscripts = libraryResource "scripts/linux/${config.name}"
  writeFile file: "${config.name}", text: testscripts
  sh "chmod a+x ./${config.name}"
}
