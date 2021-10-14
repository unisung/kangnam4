package ch02_System;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class GetProperyExam {
	public static void main(String[] args) {
	  String osName=System.getProperty("os.name");
	  String userName=System.getProperty("user.name");
	  String userHome=System.getProperty("user.home");

	  System.out.println(osName);
	  System.out.println(userName);
	  System.out.println(userHome);
	  //
	  Properties props = System.getProperties();
	  Set keys =props.keySet();
	  /*
	  for(Object objkey:keys) {
		   String key = (String)objkey;
		   String value=System.getProperty(key);
		   System.out.println("["+key+"]="+value);
	  }
	  */
	  Iterator itor = keys.iterator();
	  while(itor.hasNext()) {
		  String key = (String)itor.next();
		   String value=System.getProperty(key);
		   System.out.println("["+key+"]="+value);
	  }
	  
	  
	  
	}
}
