pipeline {
    agent {
        label 'docker'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout source code from your version control system (e.g., Git)
                git branch: 'main', credentialsId: 'ArnavGupta21', url: 'https://github.com/ArnavGupta21/ToDoApplication.git'
            }
        }

        stage('Build Maven Project') {
            steps {
                // Build the Spring Boot application using Maven
                sh 'mvn clean package'
            }
        }

        stage('Build and Push Docker Image') {
            environment {
                DOCKER_IMAGE_NAME = 'my_spring_boot_app'
                DOCKER_REGISTRY = 'your-docker-registry.com'
                DOCKER_IMAGE_TAG = 'latest'
            }
            steps {
                // Build the Docker image
                sh "docker build -t ${DOCKER_REGISTRY}/${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG} ."

                // Push the Docker image to the registry
                sh "docker push ${DOCKER_REGISTRY}/${DOCKER_IMAGE_NAME}:${DOCKER_IMAGE_TAG}"
            }
        }

        stage('Deploy') {
            environment {
                DOCKER_COMPOSE_PATH = 'path/to/your/docker-compose.yml'
            }
            steps {
                // Deploy the Docker Compose project
                sh "docker-compose -f ${DOCKER_COMPOSE_PATH} up -d"
            }
        }
    }
}
