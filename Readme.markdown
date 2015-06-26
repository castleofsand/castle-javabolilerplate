Castle Java Boilerplate
=======================

This is an example of integrating castle.io code with standard java web application.

* script set-up in index.jsp
* sending login event in LoginServlet
* calling setUser from authenticated.jsp


Pre-requisites
==============

* Maven
* Java >7
* castle-java added to your local mave repository (see below)

Building castle-java
====================

Download the code from: https://github.com/castleofsand/castle-java. Set CASTLE_TEST environment variable to your api key.

Build it with:

> mvn clean install


Running the code
================

Set environment variables: CASTLE_API_KEY and CASTLE_APP_ID.
 
Run the web server with:

> mvn tomcat7:run

Navigate to:

http://localhost:8080/castle-javaboilerplate/



