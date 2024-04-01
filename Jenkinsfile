pipeline{
  agent any
  stages{
    stage("Build"){
      steps{
        echo "Build Stage"
      }
    }
    
    
    
    stage("Test"){
      steps{
        echo "Test Stage"
        sh """
            mvn test
        """
      }
    }

    stage("Deploy"){
      steps{
        echo "Deploy Stage"
      }
    }
    
  }
}