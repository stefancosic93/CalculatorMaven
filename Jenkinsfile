node {
  stage('SCM Checkout') {
    //git 'https://github.com/stefancosic93/CalculatorMaven'
    steps {
            checkout scm
    }
  }
  stage("Compile Package") {
    sh 'mvn package'
  }
}
