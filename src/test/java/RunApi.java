import Utils.RestUtil;
import junit.framework.*;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Scanner;

import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.runner.*;

public class RunApi {
	static File ApiPack = new File("./src/test/java/Api");
	static File ApiList[] = ApiPack.listFiles(new FileFilter() {
    	public boolean accept(File file) {
    		if (file.getName().startsWith("Base.java")) {
    			return false;
    		}
    		return true;
    	}
    });
    @SuppressWarnings({ "resource", "unused" })
	public static void main(String... args) throws ClassNotFoundException {
    	String choice = "";
    	String url_c = "";
        do {
        	System.out.println("-------------------------");
        	System.out.println("1: Load baseUrl");
        	System.out.println("2: Run one");
        	System.out.println("3: Run all");
        	System.out.println("0: Exit");
        	System.out.println("-------------------------");
        	System.out.print("Your choice: ");
			Scanner sc = new Scanner(System.in);
        	choice = sc.nextLine();
        	switch(choice) {
	        	case "1":{
	        		// https://auctions-app-2.herokuapp.com/api   https://auctions-admin-2.herokuapp.com
	        		System.out.println("-----------------------------------------------------");
	        		System.out.println("1: https://auctions-app-2.herokuapp.com/api (Default)");
	            	System.out.println("2: https://auctions-admin-2.herokuapp.com");
	            	System.out.println("-----------------------------------------------------");
	            	System.out.print("Your choice: ");
					Scanner sc1 = new Scanner(System.in);
	        		url_c = sc1.nextLine();
	        		if (url_c.equals("1") || url_c.equals("")) {
	        		    RestUtil.setBaseURL("");
	        		} else {
	        			RestUtil.setBaseURL("https://auctions-admin-2.herokuapp.com");
	        		}
	        		System.out.println("Base Url loaded");
	        		break;
	        	}
	        	case "2":{
	        		if (url_c.equals("1") || url_c.equals("")){
	        			System.out.println("-------------------------");
	        	        for(int i = 0; i < ApiList.length; i++) {
	        	        	String name = ApiList[i].getName();
	        	            System.out.println(i + " : "+name.substring(0, name.lastIndexOf('.')));
	        	        }
                        try { 
		        	        Scanner sc2 = new Scanner(System.in);
			        		System.out.print("Your choice: ");
			        		String c = sc2.nextLine();
			        		Integer api_c = Integer.parseInt(c);
			        		String n = ApiList[api_c].getName();
	        	            String cl_n = "Api." + n.substring(0, n.lastIndexOf('.'));
			        		if(api_c < ApiList.length && api_c > 0) {
			        			Method[] methods = Class.forName(cl_n).getMethods();
			        			System.out.println("Unit test of this API: ");
			        			for (int i = 0; i < methods.length ; i++) {
			        				Annotation anno = methods[i].getAnnotation(org.junit.Test.class);
			        				if (anno != null) {
			        					System.out.println(i + " : " + methods[i].getName());
			        				}
			        			}
			        			Scanner sc3 = new Scanner(System.in);
				        		System.out.print("Your choice: ");
				        		int m = sc3.nextInt();
			        			Request request = Request.method(Class.forName(cl_n), methods[m].getName());
	        				    Result result = new JUnitCore().run(request);
			        		} else {
			        			System.out.println("Not available");
			        		}
			        	} catch (Exception e2) {
			        		System.out.println("Not available");	
			        	}	
                        System.out.println("-------------------------");
	        		} else {
	        			System.out.println("Base URL API test case isn't available!");
	        		}
	        		break;
	        	}
	        	case "3":{
	        		if (url_c.equals("1") || url_c.equals("")) {
	        			System.out.println("-------------------------");
	        	        for(int i = 0; i < ApiList.length; i++) {
	        	        	String name = ApiList[i].getName();
	        	            System.out.println(i + " : "+name.substring(0, name.lastIndexOf('.')));
	        	        }
                        try { 
		        	        Scanner sc2 = new Scanner(System.in);
			        		System.out.print("Your choice: ");
			        		String c = sc2.nextLine();
			        		Integer api_c = Integer.parseInt(c);
			        		String n = ApiList[api_c].getName();
	        	            String cl_n = "Api." + n.substring(0, n.lastIndexOf('.'));
			        		if(api_c < ApiList.length && api_c > 0) {
			        			System.out.println(cl_n);
			        			Result result = JUnitCore.runClasses(Class.forName(cl_n));
			        		} else {
			        			System.out.println("Not available");
			        		}
			        	} catch (Exception e) {
			        		System.out.println("Not available");	
			        	}
                        System.out.println("-------------------------");
	        		} else {
	        			System.out.println("Base URL API test case isn't available!");
	        		}
	        		break;
	        	}
	        	case "0":{
	        		System.out.println("GoodBye");
	        		break;
	        	}
	        	default:{
	        		System.out.println("Error!");
	        		break;
	        	}
        	}
        }while(!choice.equals("0"));
    }
}
