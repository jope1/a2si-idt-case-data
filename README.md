# a2si-idt-case-data
This is a simple project that holds the Javabeans used to represent the IDT Case Data.

## Getting started
First, download the code from GitHub. This can be done using the desktop git tool, an IDE which supports git or by downloading the code as a zip file which you can then extract.

Next, install the dev tools and dependencies....

##Installation of Development Tools and Dependencies
Install Git for Windows:
Install official git release: https://git-scm.com/download/win

Or install GitHub Desktop which also includes a GUI interface for git management: https://desktop.github.com/

###Install Java Development Kit 8:
http://www.oracle.com/technetwork/java/javase/downloads/

###Install Maven 3:
https://maven.apache.org/download.cgi

###Environment Variables
Ensure that the system environment variables for Java and Maven are set correctly, as described below...

M2_HOME should point to the install directory of your local Maven install folder, e.g.
M2_HOME C:\Maven\apache-maven-3.3.9

JAVA_HOME should point to the install directory of your local Java JDK install folder, e.g.

JAVA_HOME C:\Program Files\Java\jdk1.8.0_121

PATH should contain the bin directory of both M2_HOME and JAVA_HOME, e.g.

```
...;%JAVA_HOME%\bin;%M2_HOME%\bin;...
```


## Use Maven to build the project:

cd {projectRoot}
mvn clean install

the Maven "install" goal stores the built artifact into the local Maven repository, 
making it accessible to other projects using this repository.
