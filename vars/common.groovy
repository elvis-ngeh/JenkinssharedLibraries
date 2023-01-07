def call (String  stagename){
    if ("${stagename}" == "Build"){
 sh "mvn clean package"
    }
    else if ("${stagename}" == "SonarReport"){
 sh "mvn sonar:sonar"
    }
    else if ("${stagename}" == "Upload2Nexus"){
 sh "mvn deploy"
    }   
}
