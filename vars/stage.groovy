def call(String   stageName){
    if ("${stageName}" == "Build"){
        sh"mvn clean package"
    }
    if else("${stageName}" == "SonarReport"){
        sh"mvn sonar:sonar"
    }
    if else("${stageName}" == "Upload2Nexus"){
        sh "mvn deploy"
    }   
}