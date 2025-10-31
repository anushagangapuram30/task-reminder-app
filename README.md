# Task Reminder App

A simple task reminder web application built with HTML, CSS, and JavaScript, deployed using a DevOps pipeline.

## Project Overview

This project demonstrates a complete DevOps workflow for a simple web application:
- Frontend: HTML, CSS, JavaScript
- Containerization: Docker with Nginx
- CI/CD: Jenkins pipeline
- Version Control: GitHub

## DevOps Flow

1. **Code Storage**: All code is stored in GitHub
2. **Continuous Integration**: Jenkins pulls changes from GitHub when code is pushed
3. **Containerization**: Jenkins builds a Docker image with Nginx to serve the application
4. **Deployment**: The Docker container is deployed to a server

## Project Structure

- `Taskreminder.html` - The main application file
- `Dockerfile` - Configuration for building the Docker image with Nginx
- `Jenkinsfile` - Jenkins pipeline configuration for CI/CD

## How to Use

### Local Development

1. Clone this repository
2. Open `Taskreminder.html` in your browser

### Docker Deployment

```bash
# Build the Docker image
docker build -t task-reminder-app .

# Run the container
docker run -d -p 80:80 --name task-reminder-app task-reminder-app
```

### Jenkins Deployment

The Jenkins pipeline will automatically:
1. Pull the latest code from GitHub
2. Build a Docker image
3. Deploy the container to the server

## Next Steps

- Add user authentication
- Implement task persistence with a database
- Add task categories and priorities