def call(String   stageName){
    if ("${stageName}" == "Build"){
        sh "mvn clean package"
    }
    else if ("${stageName}" == "SonarReport"){
        sh "mvn sonar:sonar"
    }
    else if ("${stageName}" == "Upload2Nexus"){
        sh "mvn deploy"
    }   
}
