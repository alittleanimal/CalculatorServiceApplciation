package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

//import com.accenture.calculate.CalculatorService;
import com.accenture.calculate.CalculatorServiceForUnaryOp;

import Page.UnaryCalculatorSeleniumHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Rajitha.paravastu
 * This class is to implement source code for all of BDD/Selenium test cases
 */

public class UnaryCalculatorStepDefs {
	
	//CalculatorService calc  = new CalculatorService();
	CalculatorServiceForUnaryOp calcSingle;
	
	int x;
	double z;
	
	UnaryCalculatorSeleniumHelper cs;
	
	protected WebDriver driver; 
	
	
	@Given("^\"([^\"]*)\" input parameter$")
	public void input_parameter(int arg1) throws Throwable {
		calcSingle = new CalculatorServiceForUnaryOp();
		x = arg1;
	    
	}

	@When("^I calculate with the \"([^\"]*)\"$")
	public void i_calculate_with_the(char arg1) throws Throwable {

		z = calcSingle.calcSingle(x, arg1); //For calculation of single sqrt and inverse


	}

	@Then("^the result is \"([^\"]*)\"$")
	public void the_result_is(double arg1) throws Throwable {
		arg1 = z;
		Assert.assertEquals(arg1, z, 0.001);
		
		
	}
	
	@Then("^the result shoule be displayed as \"([^\"]*)\"$")
	public void the_result_shoule_be_displayed_as(double arg1) throws Throwable {

		Assert.assertEquals(arg1, z, 0.001);
		
	}
	

	@Given("^I am in calculator page$")
	public void i_am_in_calculator_page() throws Throwable {
		cs = new UnaryCalculatorSeleniumHelper();
	}

	@Given("^I view the screen$")
	public void i_view_the_screen() throws Throwable {
		cs.testRegister();
	}

	@Given("^I should see fields for inputnumber and operator and calculateResult and Reset$")
	public void i_should_see_fields_for_inputnumber_and_operator_and_calculateResult_and_Reset() throws Throwable {
		cs.verifyHomepage();
	}

	@Given("^I pass \"([^\"]*)\"$")
	public void i_pass(String arg1) throws Throwable {
		cs.enterFields(arg1);
	}

	@When("^I press \"([^\"]*)\"$")
	public void i_press(String arg1) throws Throwable {
		cs.enterOperator(arg1);
	}

	@When("^I click on calculateresult$")
	public void i_click_on_calculateresult() throws Throwable {
		cs.clickCalculateResult();
	}

	@Then("^the result would be displayed as \"([^\"]*)\"$")
	public void the_result_would_be_displayed_as(String arg1) throws Throwable {
		cs.checkResults(arg1);
	}

	@When("^I click on the Reset button$")
	public void i_click_on_the_Reset_button() throws Throwable {
		//cs.clickReset();
	}

	@Then("^I should see the number and Result fields are cleared$")
	public void i_should_see_the_number_and_Result_fields_are_cleared() throws Throwable {
		//cs.resetFields();
	}


}
