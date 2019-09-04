#!groovy

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                dir('spring-demo'){
                    git(
                        url:'https://git.ehealthinsurance.com/scm/ptfm/provider-conf.git'
                    )
                }
            }
        }

        stage('Init') {
            steps {
                sh 'rm -rf target'
            }
        }

        stage('Build') {
            steps {
                sh "mvn clean package"
            }
        }
}
}