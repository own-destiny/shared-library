// def call (String name, String dayOfTheWeek){
//   def testScript = libraryResource 'scripts/linux/test-script.sh'
//   sh "echo $testScript"
//   // sh './test-script.sh manitheja saturday'
// }

// vars/helloExternal.groovy
def call(String name, String dayOfTheWeek) {
    def testScript = libraryResource 'scripts/linux/test-script.sh'
    
    // Copy the script to the workspace and execute it
    sh "cp ${testScript} ${workspace}/test-script.sh && chmod +x ${workspace}/test-script.sh"
    sh "${workspace}/test-script.sh"
}
