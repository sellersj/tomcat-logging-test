# tomcat-logging-test

This is to test if tomcat logs all info to stdout and stderr or if it writes to the location
as define in the [tomcat docs](https://tomcat.apache.org/tomcat-9.0-doc/logging.html)

## building
`docker image build -t foo .`
`docker run -it --rm -p 8080:8080 foo`

start it so we can bash into it
`docker run -d -p 8888:8080 --name tc foo`
`docker exec -i -t tc /bin/bash`

