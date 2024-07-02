def call(){
  node{
    checkout scm
    pipelineConfig = readYaml file: './pipelineConfig.yml'
    println "\n $pipelineConfig"
    cleanWs()
  }
}
