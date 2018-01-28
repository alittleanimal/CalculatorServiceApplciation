package Page;

import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import utils.UnaryConstants;

public class UnaryCalculatorSeleniumHelper {

	WebDriver driver;

	public void testRegister() {
		
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
		File IEDriver = new File("C:/Data//IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", IEDriver.getAbsolutePath());
		driver = new InternetExplorerDriver(); 
		driver.get("http://localhost:8081/CalculatorUnaryServiceApplication/");
		
		//driver = new HtmlUnitDriver(); 

	}

	public void verifyHomepage() throws Exception {

		try{
		Assert.assertTrue(driver.findElement(By.id(UnaryConstants.No1)).isDisplayed()
				&& driver.findElement(By.id(UnaryConstants.Go)).isDisplayed()
				&& driver.findElement(By.id(UnaryConstants.Reset)).isDisplayed());
		
	} catch (NoSuchElementException e) {}


	}

	public void enterFields(String arg1) {
		
		try{
		driver.findElement(By.id(UnaryConstants.No1)).sendKeys(arg1);
		

	} catch (NoSuchElementException e) {}
	}

	public void enterOperator(String value) {
		
		try{
		 Select selectBox = new Select(driver.findElement(By.id(UnaryConstants.Opt)));
		    selectBox.selectByValue(value);


	} catch (NoSuchElementException e) {}
		

	}

	public void clickCalculateResult() {
		
		try{
		driver.findElement(By.id(UnaryConstants.Go)).click();
	} catch (NoSuchElementException e) {}
	}

	public void checkResults(String arg1) {
		
		try{
		String s = driver.findElement(By.id(UnaryConstants.Result)).getText();
		Assert.assertEquals(arg1, s);
	} catch (NoSuchElementException e) {}
	}

	public void clickReset() {
		
		try{
		driver.findElement(By.id(UnaryConstants.Reset)).click();
	} catch (NoSuchElementException e) {}
	}

	public void resetFields() {
		
		try{

		
		Assert.assertTrue(driver.findElement(By.id(UnaryConstants.No1)).getText().equals("")
				&&(driver.findElement(By.id(UnaryConstants.Result)).equals("")));
	} catch (NoSuchElementException e) {}
	}

	public void tearDown() {
		driver.close();
		driver.quit();
		
	}

}
