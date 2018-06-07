package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Cucumber.Cumber.BasePage;

public class UserListPage {

    WebDriver driver;
  
    public UserListPage(WebDriver driver){
    	PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="suggestionsTable")
	public WebElement tableId;
	
	@FindAll(@FindBy(xpath="//*[@id='suggestionsTable_paginate']/span/a"))
	public List<WebElement> pagenationId;
	
	@FindAll(@FindBy(xpath = "//a[contains(@class,'paginate_button')]"))
	 public List<WebElement> pageCount;
	
	 @FindBy(xpath = "//tbody[@id='table_body']/tr[@role='row']")
	 public List<WebElement> pageRecords;
	
	@FindBy(xpath = "//a[contains(@class,'paginate_button next')]")
	public WebElement nextButton;

	@FindAll(@FindBy(xpath="//*[@id='table_body']/tr"))
	public List<WebElement> tableTr;
	
	@FindAll(@FindBy(xpath="//*[@id='table_body']/tr[1]/td"))
	public List<WebElement> tableTd;
	
	@FindAll(@FindBy(xpath="//*[@id='table_body']/tr/td[2]"))
	public List<WebElement> tableTd1Name;
	
	@FindAll(@FindBy(tagName="a"))
	public List<WebElement> ele;
	
          public void tableData() throws InterruptedException{
        	
        	
        	System.out.println("pagecount===>"+pageCount.size());
        	
        	int tablerows=tableTr.size();
        	System.out.println("tablerows===>"+tablerows);
        	
        	int tablecoloumns=tableTd.size();
        	System.out.println("tablecoloumns===>"+tablecoloumns);
        	
        	for(WebElement E : tableTd1Name) {
                 System.out.println(E.getText());
            }
        	
        	int a = pageCount.size() - 2;
        	System.out.println("page count................................"+a);
        	
        	int count = Integer.parseInt(pageCount.get(a).getText());
        	System.out.println("count===>"+count);
        	
        	for (int i = 1; i <= count; i++) {
                System.out.println("Page " + i + "contains " + pageRecords.size() + " rows");
        	    nextButton.click();
        	     
           }
       	}
     }
