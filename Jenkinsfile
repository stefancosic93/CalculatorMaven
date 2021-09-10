node {
  stage('SCM Checkout') {
    //git 'https://github.com/stefancosic93/CalculatorMaven'
    checkout scm
  }
  stage("Compile Package") {
    sh 'mvn clean test'
  }
}
