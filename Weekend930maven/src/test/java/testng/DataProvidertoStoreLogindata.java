package testng;

import org.testng.annotations.DataProvider;

public class DataProvidertoStoreLogindata {

	
	  @DataProvider(name="logindata")
	  public Object [][] datastorage(){
		  
		  
		  
		  
		   return new  Object [][]  {
			   
			   {"Admin","admin123"},
			   {"Admin","admin0890"},
			   {"jonny","jacky"},
			   {"pojo","rummy"}
			   
		   };
		     
		    
	  }
}
