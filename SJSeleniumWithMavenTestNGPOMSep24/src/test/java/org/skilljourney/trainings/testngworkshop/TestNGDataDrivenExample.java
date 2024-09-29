package org.skilljourney.trainings.testngworkshop;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataDrivenExample {
	
	@Test (dataProvider = "getDataFromMethod")
	void testWithData(String firstname, String lastname) {
		
		System.out.println(firstname + " " + lastname);
		
	}
	
	@DataProvider
	String[][] getDataFromMethod() {
		
		String[][] names = new String[5][2];
		
		names[0][0] = "Ameya";
		names[0][1] = "Naik";
		
		names[1][0] = "Ruchira";
		names[1][1] = "Joshi";
		
		names[2][0] = "Pratik";
		names[2][1] = "Kadam";
		
		names[3][0] = "Tushar";
		names[3][1] = "Turkane";
		
		names[4][0] = "Monika";
		names[4][1] = "Bhivarkar";
		
		return names;
	}

}
