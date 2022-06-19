package Utils;
import java.util.*;
import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class RestUtil {
	private static JSONObject json;
	private static String baseURL = "https://auctions-app-2.herokuapp.com/api";
//	private static String baseURL = "https://auctions-admin-2.herokuapp.com";
	public String getRest() {
		return RestAssured.baseURI + "/" + RestAssured.basePath;
	}
	public void setBaseURL() {
		RestAssured.baseURI = baseURL;
	}
    public static void setBaseURL(String URL){
    	if(URL.equals("")) {
            RestAssured.baseURI = baseURL;
    	}
    	else {
    		RestAssured.baseURI = URL;
    	}
    }

    public void setBasePath(String basePathTerm){
        RestAssured.basePath = basePathTerm;
    }

    public void resetBaseURL(){
        RestAssured.baseURI = null;
    }
    
    public void resetBasePath(){
        RestAssured.basePath = null;
    } 
    
    public static JsonPath getJsonPath (Response res) {
        String json = res.asString();
        return new JsonPath(json);
    }
    
    public void setJson(Object[] keys, Object[] values, boolean add) {
    		if (keys.length != values.length) {
    		    System.out.println("Request body error!");
    		    return;
    		}
    	if (!add) {
    		Map<Object, Object> map = new HashMap<Object, Object>();
        	for (int i=0; keys.length > i; i++) {
        		map.put(keys[i], values[i]);
        	}
    	    json = new JSONObject(map);
    	} else {
        	for (int i=0; keys.length > i; i++) {
        		json.accumulate(String.valueOf(keys[i]), (Object)(values[i]));
        	}
    	}
    	
    }
    public void setJson(String key, Object value, boolean add) {
    	if (!add) {
    	    json = new JSONObject();
    	    json.accumulate(key, value);
    	}
    	else {
    		json.accumulate(key, value);
    	}
    }
    
    public JSONObject getJson() {
    	return json;
    }
}