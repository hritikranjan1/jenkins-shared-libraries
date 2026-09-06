def call (String Project , String ImageTag , String DockerHubUser){
  withCredentials([usernamePassword(credentialsId: 'dockerhubcred' , passwordVariable: 'DOCKERHUB_USER' , usernameVariable: 'DOCKERHUB_PASS')]) {
    sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
