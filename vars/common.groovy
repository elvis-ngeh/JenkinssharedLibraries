def call (String  stagename){
    if ("${stagename}" == "Build"){
sh "mvn clean package"
    }        
 else if ("${stagename}" == "SonarqubeReport"){
sh " mvn sonar:sonar"
 }
    else if ("${stagename}" == "Upload to Nexus"){
sh "mvn deploy"
}
}
