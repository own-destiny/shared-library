def call(){
  node{
    checkout scm
    pipelineConfig = readYaml file: './pipelineConfig.yml'
    println "pipelineType: ${pipelineConfig.pipelineType}"
    cleanWs()
  }
}
