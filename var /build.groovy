def call(String Image, String Tag){
   echo '🏗️ Building the code...'
        sh "docker build -t ${Image}:${Tag} ."
}
