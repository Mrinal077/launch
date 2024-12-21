pipeline {
    agent any  // This allows the pipeline to run on any available Jenkins agent (in this case, localhost)

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17'  // Ensure this path points to your Java installation
        CHROME_DRIVER_PATH = 'D:\\Eco_PVT_LTD\\chromedriver_win32'  // Path to your chromedriver
    }

    tools {
        jdk 'jdk'  // Make sure JDK 11 is configured in Jenkins Global Tool Configuration
        maven 'mvn'  // Make sure Maven is configured in Jenkins Global Tool Configuration
    }

    stages {
        stage('Checkout Code') {
            steps {
                // This step pulls your code from GitHub repository
                bat 'git' 
                bat 'git clone \'https://github.com/Mrinal077/launch.git\''
            }
        }

        stage('Install Dependencies') {
            steps {
                script {
                    // Install dependencies using Maven (same as you would do in Eclipse)
                    bat 'mvn clean install'
                }
            }
        }

        stage('Run Selenium Tests') {
            steps {
                script {
                    // Run the tests using Maven (same as Eclipse "Run" button)
                    bat 'mvn test'
                }
            }
        }

        stage('Publibat Test Results') {
            steps {
                // Jenkins will capture test results in Surefire format (generated by Maven)
                junit '**/target/test-*.xml'
            }
        }
    }

    post {
        always {
            // Clean up the workspace after the tests finibat
            cleanWs()
        }

        success {
            echo 'Tests passed successfully!'
        }

        failure {
            echo 'Tests failed. Please check the logs.'
        }
    }
}
