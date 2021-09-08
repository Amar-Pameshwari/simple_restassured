pipeline{
	agent any
	
	tools{
		maven "3.8.2"
		}
	stages{
	
		stage("Compile Stage"){
			steps{
					bat "mvn -version"
					bat "mvn clean compile"	
				}
			}
		stage("Testing Stage"){
			steps{
					bat "mvn test"
				}
			}
		stage("Deployment Stage"){
			steps{
					bat "mvn deploy"
				}
			}
		}
		
		post{
			always{
				cleanWs()
			}
		}
}