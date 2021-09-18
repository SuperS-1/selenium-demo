package com.seleniumtest.seleniumtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

	public class googledemo {
		private WebDriver driver;

		@Test(priority=0) 
		public void test1() {
		    driver.get("http://www.google.com"); 
		    String title = driver.getTitle(); 
		    System.out.println(title);
		    Assert.assertEquals(title,"Google");
		   
		}
		
		@Test
		 public void test2() {
		    WebElement gmail = driver.findElement(By.className("gb_f"));
		    gmail.click();
		}

		@Test
		public void test3() {
		    WebElement createaccount = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div/button/span"));
		    createaccount.click();
		}

			@BeforeTest
			public void beforeTest() {
				System.setProperty("webdriver.edge.driver","C:\\edgedriver_win64\\msedgedriver.exe");
			 driver = new EdgeDriver();
			}

			@AfterTest
			public void afterTest() {
				driver.quit();
			}
		}

