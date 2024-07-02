def call(){
  node{
    checkout scm
    pipelineConfig = readYaml file: './pipelineConfig.yml'
    println "pipelineType: ${pipelineConfig.pipelineType}"
    cleanWs()
  }
  switch (pipelineConfig.pipelineType){
    case 'maven':
        // mavenPipeline pipelineConfig
        println "running maven pipeline groovy"
  }
}
