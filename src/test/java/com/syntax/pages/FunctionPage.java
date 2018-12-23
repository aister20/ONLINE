package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;

public class FunctionPage extends BaseClass {

	@FindBy(xpath="//*[@id='menu_pim_viewPimModule']/b")
	public WebElement pim;

	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmp;
	
	@FindBy (id="firstName")
	public WebElement firstName;
	
	@FindBy (id="middleName")
	public WebElement middleName;
	
	@FindBy (id="lastName")
	public WebElement lastName;
	
	@FindBy (id="btnSave")
	public WebElement saveButton;
	
	@FindBy (id="btnSave")
	public WebElement verified;
	
	//Elements for second scenario
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empList;
	
	@FindBy(id="empsearch_employee_name_empName")
	public WebElement empName;
	
	@FindBy(id="empsearch_id")
	public WebElement empId;
	
	@FindBy(id="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//div[@id='tableWrapper']/table/tbody/tr/td[3]/a")
	public WebElement empClick;
	
	@FindBy(id="ohrmList_chkSelectRecord_18")
	public WebElement chkbox;
	
	@FindBy(id="btnSave")
	public WebElement editbtn;
	
	@FindBy(id="personal_DOB")
	public WebElement dobCalender;
	
	@FindBy(xpath="//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[1]/a)")
	public WebElement dobDate;
	
	@FindBy(id="btnSave")
	public WebElement saveEditBtn;
	
	@FindBy(id="btnDelete")
	public WebElement btnDelete;
	
	@FindBy(id="dialogDeleteBtn")
	public WebElement confirmBtn;
	
	public FunctionPage() {
		PageFactory.initElements(driver, this);
	}
}


