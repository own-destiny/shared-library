def call(){
 def pipelineConfig
  node{
    checkout scm
    pipelineConfig = readYaml file: './pipelineConfig.yml'
    println "$pipelineConfig"
    cleanWs()
  }
}
