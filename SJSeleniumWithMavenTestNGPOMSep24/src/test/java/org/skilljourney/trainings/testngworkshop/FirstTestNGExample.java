package org.skilljourney.trainings.testngworkshop;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNGExample {
	
	@BeforeTest
	void myTestSetup() {
		System.out.println("Inside Test Setup");
	}
	
	@BeforeMethod
	void myTestMethodSetup() {
		System.out.println("Inside Test Method Setup");
	}
	
	@Test
	void myFirstTest() {
		System.out.println("Inside My First Test");
	}
	
	@Test
	void mySecondTest() {
		System.out.println("Inside My Second Test");
	}
	
	@Test
	void myThirdTest() {
		System.out.println("Inside My Third Test");
	}
	
	@AfterTest
	void myTestTearDown() {
		System.out.println("Inside My Test TearDown");
	}

}
