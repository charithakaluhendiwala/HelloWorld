pipeline {
  
  agent any
  
  stages {
      
    stage("build") {
      steps {
        echo 'Success'
//         withMaven (maven : 'maven_3_8_5') {
//           echo 'Success'
//           sh 'mvn clean compile'
//           }
        }
      }
    stage("test") {
      steps {
        withMaven (maven : 'maven_3_8_5') {
          echo 'Success'
          //sh 'mvn test'
        }
      }
    }
    stage("deploy") {
      steps {
        withMaven (maven : 'maven_3_8_5')  {
          echo 'Success'
          //sh 'mvn deploy' 
        }
      }
    }
  }
}  
