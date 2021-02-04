pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'echo "Hello World"'
                sh 'mvn clean package'
                sh 'java -jar target/spring-boot-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
