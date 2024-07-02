def call(){
 def pipelineConfig
 pipelineConfig = readYaml file: './pipelineConfig.yml'
 println "$pipelineConfig"
  // node{
  //   checkout scm
  //   pipelineConfig = readYaml file: './pipelineConfig.yml'
  //   println "$pipelineConfig"
  //   cleanWs()
  // }
}
