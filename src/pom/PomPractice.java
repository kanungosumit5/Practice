package pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.AutoConstant;
import generics.BasePage;
import generics.ExcelLibrary;

public class PomPractice extends BasePage implements AutoConstant
{
	@FindBy(xpath="(//input[@type='text'])[1]")
	private WebElement fnTextField;
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement lnTextField;
	@FindBy(xpath="(//input[@type='text'])[3]")
	private WebElement unTextField;
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwdTextField;
	@FindBy(xpath="(//input[@type='text'])[4]")
	private WebElement emailTextField;
	@FindBy(xpath="(//input[@type='radio'])[1]")
	private WebElement mRadioButton;
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement rmCheckbox;
	@FindBy(xpath="//select[@name='countrycode']")
	private WebElement ccDropDownList;
	@FindBy(xpath="(//input[@type='text'])[5]")
	private WebElement mobNoTextField;
	@FindBy(xpath="//textarea")
	private WebElement addrTextArea;
	@FindBy(xpath="//input[@type='button']")
	private WebElement saveButton;
	
	public PomPractice(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void submit() throws IOException
	{
		fnTextField.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName,0,0));
		lnTextField.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName,0,1));
		unTextField.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName,0,2));
		pwdTextField.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName,0,3));
		emailTextField.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName,0,4));
		mRadioButton.click();
		rmCheckbox.click();
		selectByValue(ccDropDownList,"AUS");
		mobNoTextField.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName,0,5));
		addrTextArea.sendKeys(ExcelLibrary.getCellValue(excelPath, sheetName,0,6));
		saveButton.click();
	}
	
	
	

}
