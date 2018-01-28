package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.accenture.calculate.CalculatorServiceForBinaryOp;

import Page.BinaryCalculatorSeleniumHelper;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/**
 * @author Rajitha.paravastu
 * This class is to implement source code for all of BDD/Selenium test cases
 */

public class BinaryCalculatorStepDefs {
	
	CalculatorServiceForBinaryOp calc  = new CalculatorServiceForBinaryOp();
	int a, b, c;
	int x;
	double z;
	
	BinaryCalculatorSeleniumHelper cs;
	
	protected WebDriver driver; 
	
	

	@Given("^\"([^\"]*)\" and \"([^\"]*)\" as input parameters$")
	public void and_as_input_parameters(int arg1, int arg2) throws Throwable {
		calc = new CalculatorServiceForBinaryOp();
		a = arg1;
		b = arg2;
	}
	
	@Given("^\"([^\"]*)\" input parameter$")
	public void input_parameter(int arg1) throws Throwable {
		calc = new CalculatorServiceForBinaryOp();
		x = arg1;
	    
	}

	@When("^I calculate with \"([^\"]*)\"$")
	public void i_calculate_with(char arg1) throws Throwable {

		c = calc.calc(a, b, arg1);


	}

	@Then("^the result is \"([^\"]*)\"$")
	public void the_result_is(int arg1) throws Throwable {
		arg1 = c;
		Assert.assertEquals(arg1, c);
		
		
	}
	
	@Then("^the result would be \"([^\"]*)\"$")
	public void the_result_would_be(int arg1) throws Throwable {
		Assert.assertEquals(arg1, c);
		
	}
	

	@Given("^I am in calculator page$")
	public void i_am_in_calculator_page() throws Throwable {
		cs = new BinaryCalculatorSeleniumHelper();
	}

	@Given("^I view the screen$")
	public void i_view_the_screen() throws Throwable {
		cs.testRegister();
	}

	@Given("^I should see fields for number(\\d+) and number(\\d+) and operator and calculateResult and Reset$")
	public void i_should_see_fields_for_number_and_number_and_operator_and_calculateResult_and_Reset(int arg1, int arg2) throws Throwable {
		cs.verifyHomepage();
	}

	@Given("^I pass \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_pass_and(String arg1, String arg2) throws Throwable {
		cs.enterFields(arg1, arg2);
	}

	@When("^I press \"([^\"]*)\"$")
	public void i_press(String arg1) throws Throwable {
		cs.enterOperator(arg1);
	}

	@When("^I click on calculateresult$")
	public void i_click_on_calculateresult() throws Throwable {
		cs.clickCalculateResult();
	}

	@Then("^the result shoule be printed as \"([^\"]*)\"$")
	public void the_result_shoule_be_printed_as(String arg1) throws Throwable {
		cs.checkResults(arg1);
	}

	@When("^I click on the Reset button$")
	public void i_click_on_the_Reset_button() throws Throwable {
		cs.clickReset();
	}

	@Then("^I should see the numbers and Result fields are cleared$")
	public void i_should_see_the_numbers_and_Result_fields_are_cleared() throws Throwable {
		cs.resetFields();
	}


}
