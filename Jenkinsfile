pipeline {
    agent any

    stages {
        
        stage('Code ') {
            steps {
              
              echo "Cloning from github"
              git url:'https://github.com/sagar-iitg/foodApp.git', branch:'master'
                
                
            }
        }
        stage('Build'){
             steps {
            echo "Building docker image"
              
            sh 'docker build . -t sagarkumar99/foodapp:latest'
                
            }
            
        }
        stage('Push')
        {
           
            steps{
                echo "Push docker image in docker hub"
                 withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
        sh "docker login -u $USERNAME -p $PASSWORD"
        sh "docker push sagarkumar99/foodapp:latest"
    }
            }
        }
        stage('Test'){
             steps {
              
            echo "Testing the new build..."
                
                
            }
            
            
        }
         stage('Check Current Working Directory'){
             steps {
              
                   
                   
                   sh "pwd"
                
            }
         }
          
        stage('Deploy'){
             steps {
              
                   
                   
                   sh "docker-compose down && docker-compose up -d"
                
            }
         
            
        }
        
    }
}
