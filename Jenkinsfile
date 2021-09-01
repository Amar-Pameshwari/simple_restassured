pipeline{
	agent any
	
	tools{
		maven "3.8.2"
		}
	stages{
	
		stage("Compile Stage"){
			steps{
					sh "mvn -version"
					sh "mvn clean compile"	
				}
			}
		stage("Testing Stage"){
			steps{
					sh "mvn test"
				}
			}
		stage("Deployment Stage"){
			steps{
					sh "mvn deploy"
				}
			}
		}
		
		post{
			always{
				cleanWs()
			}
		}
}