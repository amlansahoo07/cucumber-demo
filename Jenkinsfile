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

        
		stage('Generate HTML report') {
        	cucumber buildStatus: 'UNSTABLE',
                reportTitle: 'My report',
                fileIncludePattern: '**/*.json',
                trendsLimit: 10,
                classifications: [
                    [
                        'key': 'Browser',
                        'value': 'Chrome'
                    ]
                ]
    	}
		
    }

}
