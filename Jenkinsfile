pipeline {
    agent any
    environment {
        NAME = 'ana'
    }
    stages {
        stage('build') {
            steps {
                echo 'building'
            }
        }
        stage('test') {
            steps {
                echo "testing ${NAME}"
            }
        }
    }
}
