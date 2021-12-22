## Java-DataBase-Connectivity-with-MySQL
### Editor : Apache Netbeans IDE 12.5
1. Let's first create a table in the MySQL database.
<br>
2. And then create a new Project in Apache Netbeans IDE. for eg: JDBC
<br>
3. And then connect Java Application with MySQL database
<h5>Steps!</h5>
      i. To connect java application with the mysql database, [mysqlconnector.jar](https://static.javatpoint.com/src/jdbc/mysql-connector.jar) file is
      required to be loaded.
      ii. Add this jar file to the libraries in your project that you created in your IDE.
      iii. Set Classpath
            There are two ways to set the classpath:
            o temporary
            o permanent
            <h5>How to set the temporary classpath</h5> 
            open command prompt and write:
            1. C:>set classpath=c:\folder\mysql-connector-java-5.0.8-bin.jar;.;
            <h5>How to set the permanent classpath</h5>
            Go to environment variable then click on new tab. In variable name
            write classpath and in variable value paste the path to the mysqlconnector.jar
            file by appending mysqlconnector.jar;.; as C:\folder\mysql-connector-java-
            5.0.8-bin.jar;.;
      
            
