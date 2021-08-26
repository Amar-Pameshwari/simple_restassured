node{
  stage('SCM Checkout'){
    git 'https://github.com/Amar-Pameshwari/simple_restassured'
  }
  stage('Compile-Package'){
    sh 'mvn package'
  }
}
