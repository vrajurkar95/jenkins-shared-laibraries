def call(String Image, String tag){
   echo '🏗️ Building the code...'
        sh "docker build -t ${Image}:${tag} ."
}
