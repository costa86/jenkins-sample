def buildApp() {
    echo 'building the application...'
} 

def testApp() {
    echo 'testing vfv the application...'
} 

def deployApp() {
    echo 'deplying the application...'
    echo "deploying version ${params.VERSION}"
} 

return this
