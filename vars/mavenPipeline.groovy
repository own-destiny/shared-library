def call(Map pipelineConfig){
  println "This line prints from mavenPipeline.groovy file ${pipelineConfig.pipelineType}"
  def globalConfigFile = libraryResource 'scripts/maven/globalDefault.yml'
  def globalConfig = readYaml file: globalConfigFile
  def defaultConfigFile = libraryResource 'scripts/maven/mavenDefault.yml'
  def defaultConfig = readYaml file: defaultConfigFile
  def protectedConfigFile = libraryResource 'scripts/maven/mavenProtected.yml'
  def protectedConfig = readYaml file: protectedConfigFile
  def config = combineMaps(globalConfig, defaultConfig, pipelineConfig, protectedConfig)
}
