def call(String Image){
   echo '🏗️ Building the code...'
        sh "docker build -t ${Image} ."
}
