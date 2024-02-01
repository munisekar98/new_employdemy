pipeline {
    agent any
    stages {
        stage('Deploy to AEM') {
            steps {
                // Deploy your code to AEM, for example using CURL commands
                // sh 'curl -u admin:admin -X POST -F package=@"path/to/your/package.zip" http://13.49.72.14:4502/crx/packmgr/service.jsp'
                sh 'curl -u admin:admin -F cmd=install http://13.49.72.14:4502/crx/packmgr/service/.json/etc/packages/com.employdemy/employdemy.ui.content-1.0.0-SNAPSHOT.zip '
                sh 'curl -u admin:admin -F cmd=install http://13.49.72.14:4502/crx/packmgr/service/.json/etc/packages/com.employdemy/employdemy.ui.config-1.0.0-SNAPSHOT.zip'
                sh 'curl -u admin:admin -F cmd=install http://13.49.72.14:4502/crx/packmgr/service/.json/etc/packages/com.employdemy/employdemy.ui.apps-1.0.0-SNAPSHOT.zip'
                }
        }
    }
}