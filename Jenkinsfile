node {
  stage('SCM Checkout') {
    //git 'https://github.com/stefancosic93/CalculatorMaven'
    checkout scm
  }
  stage('Run Tests') {
    // Permission to execute a script
    //sh "chmod +x -R ${env.WORKSPACE}/../${env.JOB_NAME}@script"
    
    // Call SH
    //sh "${env.WORKSPACE}/../${env.JOB_NAME}@script/setJavaHome.sh"
    
    bat 'mvn -v'
    bat 'mvn test'
  }
  stage('Sonar') {
    bat 'mvn clean verify sonar:sonar -Dsonar.login=f260730b8650aba93bb9cdad3310b95dbb1eec4e'
  }
}
