package com.ctli.it.mobilepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ctli.it.lib.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class bookingPage extends BaseClass{

	public bookingPage(AndroidDriver driver, ExtentTest testReport) {
		super(driver, testReport);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="//input[@type='search']")
	public WebElement tbx_destination;
	
	@FindBy(xpath="//div[text()=' Delhi NCR, India']")
	public WebElement lbl_newDelhi;
	
	@FindBy(xpath="//label[contains(text(),'Check-in date')]")
	public WebElement dpk_checkInDate;
	
	@FindBy(xpath="//label[contains(text(),'Check-out date')]")
	public WebElement dpk_checkOutDate;
	
	@FindBy(name="group_adults")
	public WebElement ddl_Adults;
	
	@FindBy(name="group_children")
	public WebElement ddl_children;
	
	@FindBy(xpath="(//span[contains(text(),'No')])[1]")
	public WebElement chk_No;
	
	@FindBy(xpath="(//button[@class='pika-next'])[1]")
	public WebElement btn_nextCheckIn;
	
	@FindBy(xpath="(//button[@class='pika-next'])[2]")
	public WebElement btn_nextCheckOut;
	
	@FindBy(xpath="(//button[text()='22'])[1]")
	public WebElement btn_date22;
	
	@FindBy(xpath="(//button[text()='5'])[2]")
	public WebElement btn_date5;
	
	@FindBy(id="submit_search")
	public WebElement btn_search;
	
	public void homePageFill(){
		type(tbx_destination, "New Delhi");
		click(lbl_newDelhi);
		jsClick(dpk_checkInDate);
		click(dpk_checkInDate);
		for(int i=0; i<4;i++){
			click(btn_nextCheckIn);
		}
		click(btn_date22);
		click(dpk_checkOutDate);
		for(int i=0; i<1;i++){
			click(btn_nextCheckOut);
		}
		click(btn_date5);
		
		selectOptionByVisibleText(ddl_Adults, "2");
		selectOptionByVisibleText(ddl_children, "4");
		click(chk_No);
		click(btn_search);
	}
}
