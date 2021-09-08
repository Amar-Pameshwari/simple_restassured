pipeline{
	agent any
	
	tools{
		maven "3.8.2"
		}
	stages{
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
