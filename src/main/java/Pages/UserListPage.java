package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserListPage {

    static WebDriver driver;
	
	public UserListPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="suggestionsTable")
	public WebElement tableId;
	
	@FindAll(@FindBy(xpath="//*[@id='suggestionsTable_paginate']/span/a"))
	public static List<WebElement> pagenationId;
	
	@FindBy(xpath="//*[@id='suggestionsTable_paginate']/span/a")
     public static WebElement pagenationIdPrev;
	
	@FindBy(id="suggestionsTable_next")
    public static List<WebElement> pagenationIdNext;
	
	@FindAll(@FindBy(xpath="//*[@id='table_body']/tr"))
	public static List<WebElement> tableTr;
	
	@FindAll(@FindBy(xpath="//*[@id='table_body']/tr[1]/td"))
	public static List<WebElement> tableTd;
	
	@FindAll(@FindBy(xpath="//*[@id='table_body']/tr/td[2]"))
	public static List<WebElement> tableTd1Name;
	
        public static void tableData() throws InterruptedException{
        	
        	int tablerows=tableTr.size();
        	System.out.println("tablerows===>"+tablerows);
        	
        	int tablecoloumns=tableTd.size();
        	System.out.println("tablecoloumns===>"+tablecoloumns);
        	
        	 for(WebElement E : tableTd1Name)
             {
                 System.out.println(E.getText());
             }
        	
        	   for(int l=0;l<pagenationId.size();l++){
           		   System.out.println(pagenationId.size());
           		   Thread.sleep(1000);
           		   if(pagenationIdPrev.isEnabled()){
           		        pagenationId.get(l).click();
           		   }
           		int k=l+1;
           		   System.out.println("No. of Rows per page===>"+tableTr.size()+" page number==>"+ k);
           	}
         }
     }
