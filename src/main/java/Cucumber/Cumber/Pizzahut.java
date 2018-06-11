package Cucumber.Cumber;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Pizzahut {
	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Springworkspace\\Cumber\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.pizzahut.co.in/customer-feedback.php");
		
		driver.findElement(By.xpath("//img[contains(@src,'images/dienien-icon.png')]")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='frmprocess']/table/tbody/tr[5]/td/table/tbody/tr[3]/td[1]/div/input")).click();
		
		
		select(driver.findElement(By.id("city_id")),"Hyderabad");
		Thread.sleep(1500);
		select(driver.findElement(By.id("storeId")),"Madhapur");
		
		
   		/*Select select=new Select(driver.findElement(By.id("city_id")));
   		select.selectByValue("50");
   		Thread.sleep(1500);
   		
   		Select select1=new Select(driver.findElement(By.id("storeId")));
   		select1.selectByVisibleText("Madhapur");*/
   		
   		driver.findElement(By.xpath("//input[@type='submit']")).click();
   		
   		Thread.sleep(500);
   		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("sathish");
   		Thread.sleep(500);
   		select(driver.findElement(By.id("typeselector")),"Male");
   		Thread.sleep(500);
   		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sathish@gmail.com");
   		Thread.sleep(500);
   		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8331848246");
   		
   		Thread.sleep(500);
   		driver.findElement(By.id("date_of_visit")).click();
   		Thread.sleep(500);
   		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[2]/a")).click();
   		
   		Thread.sleep(500);
   		driver.findElement(By.xpath("//textarea[@name='your_feedback']")).sendKeys("This is the feedback");
   		
   		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
       
   		Thread.sleep(2000);
    	WebElement uploadElement = driver.findElement(By.id("image1"));
    	uploadElement.click();
    	 
    	Thread.sleep(1000);
    	fileupload("C:\\Users\\SatishTvisha\\Pictures\\images.jpg");
        //uploadElement.sendKeys("‪C:\\Users\\SatishTvisha\\Pictures\\images.jpg");
   		
   		Thread.sleep(1000);
   	
   		WebElement uploadElement1 = driver.findElement(By.xpath("//*[@id='cutomerfeedForm']/table/tbody/tr[4]/td[2]/table/tbody/tr[18]/td[3]/font[1]"));
   		
   		System.out.println(uploadElement1.getText());
   		
   		
   	    String parts[]=uploadElement1.getText().split("\\s");
        String part2=parts[1];
     
        String part1=parts[0];
        String part3=parts[2];
     
   		System.out.println("part2===> "+part2);
   		
   		System.out.println("part1===> "+part1);
   		System.out.println("part3====> "+part3);
   		
   		if(part2.equals("+")){
   			int s=sum(Integer.parseInt(part1),Integer.parseInt(part3));
   			System.out.println("s====>"+s);
   			Thread.sleep(1000);
   			driver.findElement(By.xpath("//input[@name='math_captcha']")).sendKeys(String.valueOf(s));
   		}
   		
   		
   		if(part2.equals("÷")){
   			int s1=division(Integer.parseInt(part1),Integer.parseInt(part3));
   			System.out.println("s====>"+s1);
   			Thread.sleep(1000);
   			driver.findElement(By.xpath("//input[@name='math_captcha']")).sendKeys(String.valueOf(s1));
   		}
   		
   		if(part2.equals("×")){
   			int s2=mul(Integer.parseInt(part1),Integer.parseInt(part3));
   			System.out.println("s====>"+s2);
   			Thread.sleep(1000);
   			driver.findElement(By.xpath("//input[@name='math_captcha']")).sendKeys(String.valueOf(s2));
   		}
   		
   		if(part2.equals("-")){
   			int s3=sub(Integer.parseInt(part1),Integer.parseInt(part3));
   			System.out.println("s====>"+s3);
   			Thread.sleep(1000);
   			driver.findElement(By.xpath("//input[@name='math_captcha']")).sendKeys(String.valueOf(s3));
   		}
   		
   		Thread.sleep(500);
   		driver.findElement(By.xpath("//input[@name='submit']")).click();
   		
   		

   		 
   		
	}

	
//add	
	public static int sum(int part1, int part3){
		int sum;
		sum=part1+part3;
		System.out.println("Sum of 2 number:"+sum);
		return sum;
		
		}
	
	//divison
	public static int division(int numx, int numy){
		int div=0;
		div=(numx/numy);
		System.out.println("div of 2 number:"+div);
		return div;

		}
	
	//mul
		public static int mul(int numx, int numy){
			int mul=0;
			mul=(numx*numy);
			System.out.println("mul of 2 number:"+mul);
			return mul;

			}
		
		//sub
		public static int sub(int numx, int numy){
			int sub=0;
			sub=(numx-numy);
			System.out.println("sub of 2 number:"+sub);
			return sub;

			}

	
	
	
	public static void select(WebElement ele,String value){
		Select selec=new Select(ele);	
		selec.selectByVisibleText(value);
	}
	
	  public static void fileupload(String file) throws AWTException, InterruptedException 
	   {
			   StringSelection s = new StringSelection(file);
	        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	        
	         Robot robot = new Robot();
	         robot.keyPress(KeyEvent.VK_CONTROL);
	              robot.keyPress(KeyEvent.VK_V);
	              robot.keyRelease(KeyEvent.VK_V);
	              robot.keyRelease(KeyEvent.VK_CONTROL);
	              Thread.sleep(1000);
	              robot.keyPress(KeyEvent.VK_ENTER);
	             robot.keyRelease(KeyEvent.VK_ENTER);
	    }
	
	
}
