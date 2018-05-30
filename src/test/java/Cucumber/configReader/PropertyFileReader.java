package Cucumber.configReader;

import java.util.Properties;



import Cucumber.utility.ResourceHelper;
import browsers.BrowserType;

public class PropertyFileReader {
	
	private Properties prop=null;
	
	public PropertyFileReader(){
		prop=new Properties();
		try{
			
			prop.load(ResourceHelper.getBaseResourcespathInputStream("/src/test/java/resources/configfile/config.properties"));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
			
 public int getImplicitWait(){
	return Integer.parseInt(prop.getProperty("ImplicitWait")); 
 }
 
 public int getExplitcitWait(){
	 return Integer.parseInt(prop.getProperty("ExplicitWait"));
 }
	
	public BrowserType getBrowsers(){
		return BrowserType.valueOf(prop.getProperty("Browser"));
	}
}
