def call (username,ip ){
  sshagent(['tomcat']){
    sh "scp -o StrictHostKeyChecking=no target/*.war ${username}@${ip}:/opt/tomcat9/webapps"
    sh "ssh ${username}@${ip} sudo /opt/tomcat9/bin/shutdown.sh"
    sh "ssh ${username}@${ip} sudo /opt/tomcat9/bin/startup.sh"
   }
}
