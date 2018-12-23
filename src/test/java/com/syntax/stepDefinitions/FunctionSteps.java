package com.syntax.stepDefinitions;



import org.junit.Assert;

import org.openqa.selenium.interactions.Actions;

import com.syntax.pages.FunctionPage;
import com.syntax.pages.LoginPage;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FunctionSteps extends BaseClass  {

	LoginPage login1;
	Actions hover1 = new Actions(driver);
	FunctionPage fpage = new FunctionPage();
	 

	@Given("^I logged into OrangeHRM$")
	public void i_logged_into_OrangeHRM() {
	  
		login1 = new LoginPage();
		CommonMethods.enterValue(login1.username, BaseClass.prop.getProperty("username"));
		CommonMethods.enterValue(login1.password, BaseClass.prop.getProperty("password"));
		CommonMethods.click(login1.btnLogin);

	}

	@Given("^I navigated to the Add Employee Page$")
	public void i_navigated_to_the_Add_Employee_Page() {
		
		hover1.moveToElement(fpage.pim).click().perform();
		hover1.moveToElement(fpage.addEmp).click().perform();
	}

	@When("^I provide the first name, middle name and last name of the employee$")
	public void i_provide_the_first_name_middle_name_and_last_name_of_the_employee() {
		fpage.firstName.sendKeys("Jalfin");
		fpage.middleName.sendKeys("Galindo");
		fpage.lastName.sendKeys("Saul");
		fpage.saveButton.click();
	}

	@Then("^I successfully added an employee$")
	public void i_successfully_added_an_employee() {
		Assert.assertTrue(fpage.verified.isDisplayed());
	}

	@Given("^I navigated to the Employee List Page$")
	public void i_navigated_to_the_Employee_List_Page() {
		hover1.moveToElement(fpage.pim).click().perform();
		hover1.moveToElement(fpage.empList).click().perform();

	}

	@When("^I search for an added employee$")
	public void i_search_for_an_added_employee() {
		fpage.empName.sendKeys("Andres Hurtado Mercado");
		fpage.empId.sendKeys("0018444");
		fpage.searchBtn.click();
	}

	@When("^selected that employee$")
	public void selected_that_employee() {
		fpage.chkbox.click();
	}

	@Then("^I navigated to the employee profile$")
	public void i_navigated_to_the_employee_profile() {
		fpage.empClick.click();
	}

	@Then("^I can edit Employee information$")
	public void i_can_edit_Employee_information() {
		fpage.editbtn.click();
		
	}

	@Then("^I see error message \"([^\"]*)\"$")
	public void i_see_error_message(String arg1) {
		// Write code here that turns the phrase above into concrete actions
	}

	@Then("^I should be able to delete that employee$")
	public void i_should_be_able_to_delete_that_employee()  {
	fpage.btnDelete.click();
	fpage.confirmBtn.click();
}
}