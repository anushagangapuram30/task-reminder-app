pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: 'https://github.com/anushagangapuram30/task-reminder-app.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t taskreminder-static:latest .'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Deploy') {
            steps {
                sh 'docker run -d -p 80:80 --name taskreminder-static taskreminder-static:latest'
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}