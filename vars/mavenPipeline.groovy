def call(Map pipelineConfig){
  // println "This line prints from mavenPipeline.groovy file ${pipelineConfig.pipelineType}"
  println "reading the default config values from the globaldefault and maven default values"
  def globalConfigFile = libraryResource '../scripts/maven/globalDefault.yml'
  def globalConfig = readYaml file: globalConfigFile
  def defaultConfigFile = libraryResource '../scripts/maven/mavenDefault.yml'
  def defaultConfig = readYaml file: defaultConfigFile
  def protectedConfigFile = libraryResource '../scripts/maven/mavenProtected.yml'
  def protectedConfig = readYaml file: protectedConfigFile
  println "calling combine maps functions"
  def config = combineMaps (globalConfig, defaultConfig, pipelineConfig, protectedConfig)
}
