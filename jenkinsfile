node {
  stage('SCM Checkout') {
    git 'https://github.com/stefancosic93/CalculatorMaven'
  }
  stage("Compile Package") {
    sh 'mvn package'
  }
}
