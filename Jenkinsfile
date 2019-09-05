#!groovy

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                dir('spring-demo'){
                    git(
                        url:'https://github.com/1581231966/spring-demo.git'
                    )
                }
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean package"
            }
        }
    }
}