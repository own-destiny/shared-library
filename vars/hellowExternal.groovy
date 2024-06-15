// def call (Map config = [:]){
//   loadScript(name: 'test-script.sh')
//   sh './test-script.sh manitheja saturday'
// }

def call(){
  def testScript = libraryResource 'scripts/linux/test-script.sh'
  writeFile file: "test-script.sh", text: testScript
  sh "chmod +x ./test-script.sh"
  sh "./test-script.sh"
}
// vars/helloExternal.groovy 
// def call(String name, String dayOfTheWeek) {
//     def testScript = libraryResource 'scripts/linux/test-script.sh'
    
//     // Copy the script to the workspace and execute it
//     sh "cp ${testScript} ${workspace}/test-script.sh && chmod +x ${workspace}/test-script.sh"
//     sh "${workspace}/test-script.sh"
// }
// got error cp missing
