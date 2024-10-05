package org.skilljourney.trainings.pom.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SQLWriter {
    private static String url;
    private static String userName;
    private static String password;
	private static Statement statement;
	private static Connection connection;

    static void writeData(String query) throws FileNotFoundException, IOException {
    	
    	 url = UtilityClass.configMethod("db.url");
    	userName = UtilityClass.configMethod("db.username");
    	password = UtilityClass.decodeBase64("db.password");
        
        try {
        	connection = DriverManager.getConnection(url, userName, password);
            statement = connection.createStatement();
        	int rowsAffected = statement.executeUpdate(query);
        	System.out.println(rowsAffected + " Rows affected");
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
        	try {
				if(statement!=null)statement.close();
				if(connection!=null)connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException {

    	// Here it's our choice to give semi colon at the end in SQL query
    	SQLReader.fetchFromSQL("SELECT * FROM rajeshtable");
//    	writeData("INSERT INTO rajeshtable VALUES('Ameya','Naik',45,'1122334455');");
//    	writeData("UPDATE rajeshtable SET phone = '9988776644' WHERE fName = 'Rajesh'");
//    	writeData("UPDATE rajeshtable SET lName = 'Kashyap' WHERE fName = 'Rajesh'");
    	
//    	writeData("DELETE FROM rajeshtable WHERE fName='Rajesh'");
    	
    	SQLReader.fetchFromSQL("SELECT * FROM rajeshtable;");
	}
    
}
