pipeline {
    agent any 
    tools {
        maven "3.8.3"
    }
    stages {
        stage('Example Build') {
           steps {
               bat 'mvn  -version'
               bat 'mvn clean install'
           }
        }
    }
    post {
        always {
           cleanWs()
        }
    }
}