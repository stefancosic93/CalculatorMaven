@Library('SharedLibSTF_Jenkins')
import org.demo.Utilities
import static org.demo.UtilitiesMaven.*

def utils = new Utilities(env, steps)

node {
  mvn this, 'clean package'
}
/*

node {
  stage('Use SharedLibs') {
    utils.fun1()
    echo utils.fun2(2)
    utils.checkout()
  }
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
  stage('Upload to Artifactory') {
    def server = Artifactory.server 'artifactory-server'
    
    def uploadSpec = """{
      "files": [
        {
          "pattern": "target/*.jar",
          "target": "MavenRepo/stefan.cosic/"
        }
     ]
    }"""
      def buildInfo = Artifactory.newBuildInfo()
      server.upload spec: uploadSpec, buildInfo: buildInfo
      server.publishBuildInfo buildInfo 
    }
   
}
*/
