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
   // bat 'mvn test'
  }
  stage('Others') {
  //  bat 'mvn -v'
  }
}
