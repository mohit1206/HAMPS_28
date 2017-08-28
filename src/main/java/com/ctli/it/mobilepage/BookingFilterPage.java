package com.ctli.it.mobilepage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ctli.it.lib.BaseClass;
import com.relevantcodes.extentreports.ExtentTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookingFilterPage extends BaseClass{

	public BookingFilterPage(AndroidDriver driver, ExtentTest testReport) {
		super(driver, testReport);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@FindBy(xpath="(//button[@data-tab-target='sr_sortfilters'])[1]")
	public WebElement btn_filter;
	
	@FindBy(xpath="//a[contains(text(),'WiFi')]")
	public WebElement btn_Wifi;
	
	@FindBy(xpath="//a[contains(text(),'Spa Bath')]")
	public WebElement btn_spa;
	
	@FindBy(xpath="//a[contains(text(),'Saket')]")
	public WebElement btn_saket;
	
	
	
	public void applyFilter() throws InterruptedException{
		click(btn_filter);
		click(btn_Wifi);
		click(btn_filter);
		ArrayList<Integer> aList = new ArrayList<Integer>();
		List<WebElement> lst =driver.findElements(By.xpath("//div[div[contains(text(),'Your budget (per night)')]]//span"));
		for(int i=0; i<lst.size();i++){
			int value =Integer.parseInt(lst.get(i).getText());
			aList.add(value);
		}
		Collections.sort(aList);
		driver.findElement(By.xpath("//div[div[contains(text(),'Your budget (per night)')]]//span[contains(text(),'"+aList.get(aList.size()-1)+"')]")).click();
		Thread.sleep(3000);
		click(btn_filter);
		driver.findElement(By.xpath("//div[div[contains(text(),'Your budget (per night)')]]//span[contains(text(),'"+aList.get(aList.size()-2)+"')]")).click();
	}
	
	

}
