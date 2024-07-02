def call(){
  node{
    checkout scm
    pipelineConfig = readYaml file: './pipelineConfig.yml'
    println "pipelineType: ${pipelineConfig.pipelineType}"
    cleanWs()
  }
  switch (pipelineConfig.pipelineType){
    case 'maven-1':
        mavenPipeline pipelineConfig
        break
    default:
        echo "Must define a pipelineType in Jenkins.yml (maven, gradle, nodejs, python, tarball, iac-cfn<-appdev>, iac-tf-v<1,2>, iac-tf-mod-publish, iac-nix-publish, avm(-v2), cldnet, helm, kongapi, kongplugin, kongmanifest, dotNetCore, dotNetFramework)!"
        break
  }
}
