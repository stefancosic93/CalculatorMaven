node {
  stage('SCM Checkout') {
    //git 'https://github.com/stefancosic93/CalculatorMaven'
    checkout scm
  }
  stage('Set JAVA_HOME') {
     sh "./setJavaHome.sh"
  }
  stage('Compile Package') {
    sh 'mvn clean test'
  }
}
