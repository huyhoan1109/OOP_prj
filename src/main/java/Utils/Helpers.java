package Utils;

import io.restassured.path.json.exception.JsonPathException;
import io.restassured.response.*;
import java.io.File;
import static io.restassured.RestAssured.given;

public class Helpers {
	public String token = "";
    public static void checkStatusIs (Response res, boolean choice) {
    	try {
	    	int code = Integer.parseInt(res.jsonPath().getString("code"));
	    	String message = res.jsonPath().getString("message");
	    	assert code == 1000: "\n" + code + "\n" + message;
	    	if (choice) {
	    	     res.getBody().prettyPrint();
	    	}
    	} catch(JsonPathException e) {
    		RestUtil api = new RestUtil(); 
    		api.setBaseURL();
    		api.setBasePath("loginfailed");
    		Response e_re = given()
                    .when()
                    .get()
                    .then()
                    .extract().response();
    		assert !e_re.jsonPath().getString("code").equals("1004"): "Error";
    		if (choice) {
    			e_re.getBody().prettyPrint();
	    	}
    	}
    }
    public static void checkStatusIs (Response res) {
    	try {
	    	int code = Integer.parseInt(res.jsonPath().getString("code"));
	    	String message = res.jsonPath().getString("message");
	    	assert code == 1000: "\n" + code + "\n" + message;;
    	} catch(JsonPathException e) {
    		RestUtil api = new RestUtil(); 
    		api.setBaseURL();
    		api.setBasePath("loginfailed");
    		Response e_re = given()
                    .when()
                    .get()
                    .then()
                    .extract().response();
    		assert !e_re.jsonPath().getString("code").equals("1004"): "Error";
    	}
   }
    public static void deleteAll() {
    	try {
            File file = new File("./token.out");
            if (file.delete()) {
                System.out.println(file.getName() + " is deleted!");
            } else {
                System.out.println("Delete operation is failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
