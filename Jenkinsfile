node {
  stage('SCM Checkout') {
    //git 'https://github.com/stefancosic93/CalculatorMaven'
    checkout scm
  }
  stage('Set JAVA_HOME') {
    // Permission to execute a script
    sh "chmod +x -R ${env.WORKSPACE}/../${env.JOB_NAME}@script"
    
    // Call SH
    sh "${env.WORKSPACE}/../${env.JOB_NAME}@script/setJavaHome.sh"
    
  //  sh 'mvn -v'
  //  sh 'mvn test'
    String jenkinsUserId = sh(returnStdout: true, script: 'id -u jenkins').trim()
    String dockerGroupId = sh(returnStdout: true, script: 'getent group docker | cut -d: -f3').trim()
    String containerUserMapping = "-u $jenkinsUserId:$dockerGroupId "
    docker.image('image')
        .inside(containerUserMapping + ' -v /var/run/docker.sock:/var/run/docker.sock:ro') {
             sh "mvn test"
         }
  }
  stage('Compile Package') {
    sh 'mvn -v'
    //sh 'mvn clean test'
  }
}
