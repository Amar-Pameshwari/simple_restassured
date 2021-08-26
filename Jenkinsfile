node{
  stage('SCM Checkout'){
    git 'https://github.com/Amar-Pameshwari/simple_restassured.git'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
