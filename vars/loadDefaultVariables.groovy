def call(){
  def globalDefaultFile = libraryResource 'scripts/maven/globalDefault.yml'
  def globalDefaultValues = readYaml text: globalDefaultFile
  def mavenDefault = libraryResource 'scripts/maven/mavenDefault.yml'
  def mavenDefaultValues = readYaml text: mavenDefault
  def mavenProtected = libraryResource 'scripts/maven/mavenProtected.yml'
  def mavenprotectedValues = readYaml text: mavenProtected
  def config = combineMaps (globalDefaultValues,mavenDefaultValues,mavenprotectedValues)
  sh "echo $config"
}
