def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing wfefewfsvdsvddvfvd  the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
