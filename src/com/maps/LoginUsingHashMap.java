package com.maps;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginUsingHashMap {

	public static void main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		String adminCredential = LoginData.getUserLoginInfo().get("customer");
		String [] customerLogin = adminCredential.split("_");
		driver.findElement(By.className("username")).sendKeys(customerLogin[0]);
		driver.findElement(By.className("password")).sendKeys(customerLogin[1]);

	}
	
	

}


class LoginData{
	
	public static HashMap<String, String> getUserLoginInfo() {
		HashMap<String, String> userMap = new HashMap<String, String>();
		//userMap.put(usertype, username_password);
		userMap.put("customer", "tom123_qw12345");
		userMap.put("admin", "peter123_qa12345"); 
		
		return userMap;
	}
}
