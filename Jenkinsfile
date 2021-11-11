pipeline {
    agent any 
    tools {
        maven "3.8.4"
    }
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