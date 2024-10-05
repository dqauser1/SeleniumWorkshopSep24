package org.skilljourney.trainings.pom.common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
import java.util.Properties;

public class UtilityClass {

	public static String configMethod(String prop) throws FileNotFoundException, IOException {

		Properties property = new Properties();
		
		property.load(new FileInputStream("config.properties"));
		
		return property.getProperty(prop);
	}
	
	public static String decodeBase64(String encodedPassword) {
        byte[] decodedBytes = null;
		try {
			decodedBytes = Base64.getDecoder().decode(configMethod(encodedPassword));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return new String(decodedBytes);
    }
	
}
