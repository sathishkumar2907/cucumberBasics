package Cucumber.Cumber;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

  public static WebDriver driver;
  Properties prop;
  FileInputStream fileInputStream;
  
  public void getProperties(){
	
	  try{
		  
		  prop=new Properties();
		  fileInputStream=new FileInputStream(System.getProperty("user.dir")+"//application.properties");
		  System.out.println("Path ====> "+System.getProperty("user.dir")+"//application.properties");
		  prop.load(fileInputStream);
		  
	  }catch(Exception e){
		  e.printStackTrace();
	  }
  } 
  
  
  public void SetUpBrowser() throws InstantiationException, IllegalAccessException{
	  
	  switch(prop.getProperty("browser")) {
	  
	  case "Chrome":
		  
		    System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		break;
		
	  case "Firefox":
		  
		    System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		break;
		
	default:
		
		    System.setProperty("webdriver.chrome.driver", "D:\\Springworkspace\\Cumber\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		
		break;
	  
	   }
	}
  
	/* public void login(){
		System.setProperty("webdriver.chrome.driver", "D:\\Springworkspace\\Cumber\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}*/
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	public void quite(){
	
		try{
	    
			driver.quit();
	        driver.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void selectByIndex(WebElement element,int arg){
		
		try{
			Select select=new Select(element);
			select.selectByIndex(arg);
			
	 	}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
	public void selectByText(WebElement element,String arg){
		
		try{
			
			Select select=new Select(element);
			select.selectByVisibleText(arg);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
    
	public void selectByValue(WebElement element,String arg){
		
		try{
			
			Select select=new Select(element);
			select.selectByValue(arg);
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	
    public void text(String text){
	    
		try{
		     driver.findElement(By.id("")).sendKeys(text);
		}catch(Exception e){
	        e.printStackTrace();
		}
	 }
	
	
	public void actions(WebElement element){
		
		try{
			
			Actions actions = new Actions(driver);
			Action act = actions.moveToElement(element).build();
			act.perform();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
}


