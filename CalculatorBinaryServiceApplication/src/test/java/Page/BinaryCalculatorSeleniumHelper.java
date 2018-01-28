package Page;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import utils.BinaryConstants;

public class BinaryCalculatorSeleniumHelper {

	WebDriver driver;

	public void testRegister() {

		File IEDriver = new File("C:/Data//IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath());
		driver = new InternetExplorerDriver(); 
		driver.get("http://localhost:8081/CalculatorBinaryServiceApplication/");
		
		//driver = new HtmlUnitDriver(); 

	}

	public void verifyHomepage() throws Exception {

		try{
		Assert.assertTrue(driver.findElement(By.id(BinaryConstants.No1)).isDisplayed()
				&& driver.findElement(By.id(BinaryConstants.No2)).isDisplayed()
				&& driver.findElement(By.id(BinaryConstants.Go)).isDisplayed()
				&& driver.findElement(By.id(BinaryConstants.Reset)).isDisplayed());
		
	} catch (NoSuchElementException e) {}


	}

	public void enterFields(String arg1, String arg2) {
		
		try{
		driver.findElement(By.id(BinaryConstants.No1)).sendKeys(arg1);
		driver.findElement(By.id(BinaryConstants.No2)).sendKeys(arg2);

	} catch (NoSuchElementException e) {}
	}

	public void enterOperator(String value) {
		
		try{
		 Select selectBox = new Select(driver.findElement(By.id(BinaryConstants.Opt)));
		    selectBox.selectByValue(value);


	} catch (NoSuchElementException e) {}
		//driver.findElement(By.id(Constants.Opt)).sendKeys(arg1);

	}

	public void clickCalculateResult() {
		
		try{
		driver.findElement(By.id(BinaryConstants.Go)).click();
	} catch (NoSuchElementException e) {}
	}

	public void checkResults(String arg1) {
		
		try{
		String s = driver.findElement(By.id(BinaryConstants.Result)).getText();
		Assert.assertEquals(arg1, s);
	} catch (NoSuchElementException e) {}
	}

	public void clickReset() {
		
		try{
		driver.findElement(By.id(BinaryConstants.Reset)).click();
	} catch (NoSuchElementException e) {}
	}

	public void resetFields() {
		
		try{

		Assert.assertTrue(driver.findElement(By.id(BinaryConstants.No1)).getText().equals("")
				&& driver.findElement(By.id(BinaryConstants.No2)).getText().equals("")
				&& driver.findElement(By.id(BinaryConstants.Result)).getText().equals(""));
	} catch (NoSuchElementException e) {}
	}

	public void tearDown() {
		driver.close();
		driver.quit();
		
	}

}
