pipeline {
    agent any 
    stages {
        stage('Example Build') {
           steps {
                sh 'mvn  --version'
               sh 'mvn clean install'
           }
        }
    }
    post {
        always {
           cleanWs()
        }
    }
}