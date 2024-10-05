package org.skilljourney.trainings.pom.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SQLReader {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		fetchFromSQL("Select * from rajeshtable");

	}

	static void fetchFromSQL(String query) throws FileNotFoundException, IOException {
		
		List<String[]> result = new ArrayList<>(readSQLData(query));
		
		for(String[] row: result) {
			
			for(String data : row) {
				System.out.print(data + "\t");
			}
			
			System.out.println();
		}
	}

	private static List<String[]> readSQLData(String query) throws FileNotFoundException, IOException {
		
		List<String[]> data = new ArrayList<>();
		
		String url = UtilityClass.configMethod("db.url");
		String userName = UtilityClass.configMethod("db.username");
		String password = UtilityClass.decodeBase64("db.password");
		
		try {
			Connection connection = DriverManager.getConnection(url, userName, password);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(query);

			ResultSetMetaData metaData = resultSet.getMetaData();
			
			
			int ColumnCount = metaData.getColumnCount();
			
			//To fetch Column Names from SQL table
			String[] columnNames = new String[ColumnCount];
			
			for(int i = 0; i<ColumnCount; i++) {
				columnNames[i] = metaData.getColumnName(i+1);
			}
			
//			List<String[]> data = new ArrayList<>(); created this list above.
			data.add(columnNames);
			
			//to fetch Data from columns from SQL table
			while(resultSet.next()) {
				String[] row = new String[ColumnCount];
				for(int i = 0; i<ColumnCount; i++) {
					row[i] = resultSet.getString(i+1);
				}
				
				data.add(row);
			}

		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return data;
	}

}
