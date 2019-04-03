FROM tomcat:9

COPY target/app.war /usr/local/tomcat/webapps/app.war

# this is the work around to make sure that the container isn't logging to a file
COPY src/test/resources/logging-stdout.properties /usr/local/tomcat/conf/logging.properties
