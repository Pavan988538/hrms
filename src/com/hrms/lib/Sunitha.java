package com.hrms.lib;


import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Sunitha extends  Pavan{
public void openapplication() {
	System.setProperty("WebDriver.gecko.driver", "C:\\SOFTWARE'$\\GECKO DRIVER\\geckodriver-v0.32.0-win-aarch64\\geckodriver.exe");
driver = new FirefoxDriver();
	driver.get(url);
	System.out.println("application open");
}
public void login() {
	driver.findElement(By.name(login_name)).sendKeys(un);
	driver.findElement(By.name(password)).sendKeys(pw);
	driver.findElement(By.name(login_button)).click();
	System.out.println("login completed");
}
public void logout() {
	driver.findElement(By.linkText(logout_button)).click();
	System.out.println("logout completed");
}
public void closeapplication() {
	driver.quit();
	System.out.println("app closed");
}
public void waight() throws Exception {
	Thread.sleep(3000);
}
public void enterFrame() {
    driver.switchTo().frame(frame_empinfo);
    System.out.println("entered into frame");
}
public void exitFrame() {
    driver.switchTo().defaultContent();
    System.out.println("exit from frame");
}
public void addNewEmp() {
    driver.findElement(By.xpath(btn_Add)).click();
    driver.findElement(By.name(txt_EFN)).sendKeys(EFN);
    driver.findElement(By.name(txt_ELN)).sendKeys(ELN);
    driver.findElement(By.id(btn_save)).click();
    System.out.println("NewEmpAdded");
}
    @BeforeClass
    public void startUp() {
    System.setProperty("webdriver.gecko.driver", "F:\\Suresh_Selenium\\Drivers\\geckodriver.exe");
        driver =new FirefoxDriver();
    }
    @AfterClass
    public void tearDown() {
      driver.close();
    }
    @Test
    public void tc001() throws Exception{
    driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
    Reporter.log("Application Opened"); //htmlReport
    driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
    driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
    driver.findElement(By.name("Submit")).click();
    Thread.sleep(3000);
    Reporter.log("Login completed");
    Reporter.log(driver.getTitle());
    System.out.println("Login completed");
    driver.findElement(By.linkText("Logout")).click();
    System.out.println("Logout completed");
    
}
}	



