# Introduction #

The following information may be used to conduct Apache Tomcat administration operations via the web interface.


# Details #

  * Apache Tomcat Manager Application may be reached from http://swe.cmpe.boun.edu.tr:8180/manager/html/. User name and password information is available from the "tomcat-users.xml" file located in "~/apache-tomcat-7.0.22/conf/"
  * Any WAR files present in the "~/apache-tomcat-7.0.22/webapps" directory are going to be deployed automatically by the tomcat process, if there were no previous runtime errors.
  * In case of errors, try restarting tomcat by invoking "shutdown.sh" and "startup.sh" scripts from "~/apache-tomcat-7.0.22/bin" directory.
  * Tomcat may not be able to deploy a WAR file if the required database or tables are not available.