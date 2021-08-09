pipeline{

    agent any

    stages {

        stage('Clean and Compile') { 
            steps {

                bat "mvn clean compile"
            }
        }
       
		stage('Junit5 Test') { 
            steps {

                bat "mvn test"
            }
        }
        
        stage('Maven Build') { 
            steps {
                bat "mvn package"
            }
        }

        stage ('Cucumber Reports') {

            steps {
                cucumber buildStatus: "UNSTABLE",
                    fileIncludePattern: "**/cucumber.json",
                    jsonReportDirectory: 'target'

            }

        }

    }

}
