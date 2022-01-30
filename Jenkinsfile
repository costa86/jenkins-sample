def gv

pipeline {
    agent any
    parameters {
        choice(name:"VERSION",choices:["1.1","1.2"],description:"stuff")
        booleanParam(name:"runTest",defaultValue:true,description:"run test")
    }
    environment {
        NAME = 'ana'
    }
    stages {
        stage("init"){
            script {
                gv = load "script.groovy"
            }
        }

        stage('build') {
            steps {
                echo 'building'
            }
        }
        stage('test') {
            when {
                expression {
                    params.runTest
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
    }
}
