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
                bat 'docker build -t taskreminder-static:latest .'  // Already correct
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
            }
        }
        stage('Deploy') {
            steps {
                bat 'docker run -d -p 80:80 --name taskreminder-static taskreminder-static:latest'  // Changed from sh to bat
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}
