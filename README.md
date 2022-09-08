# Java
Java courses with the use of Bean Session and PostgreSQL

Implementation of Java Beans, Bean Session with Stateful and Stateless, for the understanding of the difference between Stateful and Stateless Beans and more. Furthermore, I introduced my self to the building of a Java app : .jar compression, java classes, java compilator and GlassFish server  


///////// TP 1    

** In "Server" dir  
// Compile files in "Server" File  
javac *a  

// Create an archive (example)  
mkdir META-INF  
jar cvf Exo1.jar *s META-INF  

// Watch an archive without opening it  
jar tvf Exo1.jar  
    
// Start asadmin  
asadmin start-domain    

** In "Client" dir 
// Compile Client  (example):  
javac -classpath Exo2.jar Client.java  
java -cp "%CLASSPATH%;TP2.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    

///////// TP 2     

** In "Server" dir  
javac biblio\\*a  
jar cvf TP2.jar biblio\\*s META-INF\\\*xml    

** In "Client" dir  
Copy the TP2.jar to the client directory  
javac -classpath TP2.jar Client.java  
java -cp "%CLASSPATH%;TP2.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    
