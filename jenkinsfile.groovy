pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/anushagangapuram30/task-reminder-app.git'  // Replace with your GitHub repo URL
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    docker.build('task-reminder-backend:latest')  // Builds the image using the Dockerfile
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'  // Placeholder for tests (add real tests if available, e.g., npm test)
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Push to Docker Hub
                    docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {  // Uses your Docker Hub credentials
                        docker.image('task-reminder-backend:latest').push('latest')
                    }
                    // Run the container
                    sh 'docker run -d -p 3000:3000 --name task-reminder-backend task-reminder-backend:latest'
                }
            }
        }
    }
    post {
        always {
            cleanWs()  // Clean up workspace after build
        }
    }
}