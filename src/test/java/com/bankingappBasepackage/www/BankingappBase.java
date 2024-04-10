package com.bankingappBasepackage.www;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankingappBase {
	
	
	public static WebDriver driver;
    public String browser;
	
	public void setup() {		
		Scanner ss=new Scanner(System.in);		
		System.out.println("Please enter the browser name(chrome,Edge,firefox):---");
		browser=ss.nextLine();
		
		
		if(browser.equalsIgnoreCase("chrome")) {
		  driver=new ChromeDriver();			
		}
	}

}
