================================================================================
Use JAX-WS for service code.
------------------------------------------------------------
Deploy to Tomcat in Eclipse.
------------------------------------------------------------
Test URL.

GET: http://localhost:8080/WsTomcatSample1/Hello
------------------------------------------------------------
Tested with SoapUI and browser.
================================================================================
In "web.xml", the "<servlet-name>" can be defined to any name.
It is not used anywhere in the codes and in "sun-jaxws.xml"!

In "web.xml", the "<url-pattern>" is important. It will be used in the endpoint URL.
It will be used in definition of "<endpoint>" in "sun-jaxws.xml".
But it is not used anywhere in the codes!

In "sun-jaxws.xml", the "name" attribute of "<endpoint>" can be defined to any name.
It is not used anywhere in the codes and in "web.xml"!
================================================================================
"maven-war-plugin" for VirturlBox
------------------------------------------------------------
When running this project from a shared disk in VirtualBox, it must use version 2.4 for WAR plugin.

				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-war-plugin</artifactId>
				<version>2.4</version>

Otherwise, it can use higher version, such as "2.6", "3.2.0".
================================================================================
