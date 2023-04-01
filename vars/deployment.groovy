def call ( ){
  sshagent(['tomcat']){
                    sh "scp -o StrictHostKeyChecking=no target/*.war gokul@20.208.40.21:/opt/tomcat9/webapps"
                    sh "ssh gokul@20.208.40.21 sudo /opt/tomcat9/bin/shutdown.sh"
                    sh "ssh gokul@20.208.40.21 sudo /opt/tomcat9/bin/startup.sh"
                }
}
