def call(){
  node{
    checkout scm
    pipelineConfig = readYaml file: './pipelineConfig.yml'
    println "$pipelineConfig +'\n'"
    cleanWs()
  }
}
