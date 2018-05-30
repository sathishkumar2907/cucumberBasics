package Loggers;

import org.apache.log4j.Logger;


public class Loggerhelper {
	 
	private static boolean root = false;
	public static Logger getLogger(Class clas){
        
		if(root){
    	   return Logger.getLogger(clas);
         }	
          root=true;
          return Logger.getLogger(clas);
	   }
	
	

}
