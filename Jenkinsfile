pipeline {
    agent any

    stages {
        
        stage('Code ') {
            steps {
              
              echo "Cloning from github"
              git url:'https://github.com/sagar-iitg/foodApp.git', branch:'master'
                
                
            }
        }
       
       
        stage('Test'){
             steps {
              
            echo "Testing the new build..."
                
                
            }
            
            
        }
        
          
        stage('Deploy'){
             steps {
              
                   
                   
                   bash "docker-compose down && docker-compose up -d"
                
            }
         
            
        }
        
    }
}
