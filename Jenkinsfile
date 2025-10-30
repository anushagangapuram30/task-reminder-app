pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/anushagangapuram30/task-reminder-app.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build('taskreminder-static:latest')
                }
            }
        }
        stage('Deploy') {
            steps {
                script {
                    sh 'docker run -d -p 80:80 --name taskreminder-static taskreminder-static:latest'
                }
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}
