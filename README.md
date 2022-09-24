# Java
<h1>Java school courses with the use of Bean Session, GlassFish, API QUery and PostgreSQL.</h1>

Implementation of Java Beans, Bean Session with Stateful and Stateless, for the understanding of the difference between Stateful and Stateless Beans, Object Serialization, API Query, SQL in Java, EJB. Furthermore, I introduced my self to the building of a Java app : .jar compression, java compilator, PostgreSQL database and GlassFish server. Done in a book management example.


<h2>TP 1 : Stateful and Stateless Beans, use of GlassFish server</h2>    

<h3>In "Server" dir</h3>  
Compile files in "Server" File  
javac *a  

<h3>Create an archive (example)</h3>  
mkdir META-INF  
jar cvf Exo1.jar *s META-INF  

<h3>Watch an archive without opening it</h3>  
jar tvf Exo1.jar  
    
<h3>Start asadmin</h3>  
asadmin start-domain    

<h3>deploy an archive</h3>
asadmin deploy --force Exo1.jar

<h3>In "Client" dir</h3> 
Compile Client  (example) 
javac -classpath Exo1.jar Client.java  
java -cp "%CLASSPATH%;Exo1.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    

<h2>TP 2 : Book management with borrowers, java interfaces and EntityManager</h2>     

<h3>In "Server" dir</h3>  
javac biblio\*a  
del emprunt\*_*
jar cvf TP2.jar biblio\*s META-INF\*xml    

<h3>In "Client" dir</h3>  
Copy the TP2.jar to the client directory 
asadmin deploy --force TP3.jar 
javac -classpath TP2.jar Client.java  
java -cp "%CLASSPATH%;TP2.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    


<h2>TP 3 : Serializable class, interfaces, EntityManager, API Query and PostGreSQL for Book Management </h2>    
<h3>In "Server" directory</h3> 
javac emprunt\*a  
del emprunt\*_*  
jar cvf TP3.jar emprunt\*s META-INF\*xml  
  

<h3>In "Client" directory</h3>  
Copy the TP3.jar to the client directory  
asadmin deploy --force TP3.jar  
javac -classpath TP3.jar Client.java  
java -cp "%CLASSPATH%;TP3.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client    
