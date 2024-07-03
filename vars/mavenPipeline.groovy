def call(Map pipelineConfig){
  // println "This line prints from mavenPipeline.groovy file ${pipelineConfig.pipelineType}"
  println "reading the default config values from the globaldefault and maven default values"
  def globalConfigFile = libraryResource 'maven/globalDefault.yml'
  def globalConfig = readYaml text: globalConfigFile
  def defaultConfigFile = libraryResource 'maven/mavenDefault.yml'
  def defaultConfig = readYaml text: defaultConfigFile
  def protectedConfigFile = libraryResource 'maven/mavenProtected.yml'
  def protectedConfig = readYaml text: protectedConfigFile
  println "calling combine maps functions"
  def config = combineMaps (globalConfig, defaultConfig, pipelineConfig, protectedConfig)
}
