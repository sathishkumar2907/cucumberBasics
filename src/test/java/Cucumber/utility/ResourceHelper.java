package Cucumber.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceHelper {

	public static String  getResourcespath(String resource){
		String path=getBaseResourcespath()+resource;
		return path;
	}
	
     public static String  getBaseResourcespath(){
		//String path=ResourceHelper.class.getClass().getResource("/").getPath();
		String path=System.getProperty("user.dir");
		System.out.println(path);
		return path;
	}
     
     public static InputStream getBaseResourcespathInputStream(String resource) throws FileNotFoundException{
    	return new FileInputStream(ResourceHelper.getResourcespath(resource));
   	}
     
     public static void main(String[] args) throws FileNotFoundException {
    	System.out.println(getBaseResourcespathInputStream("configfile"+"/config.properties"));
	}
       
}
