package api.sampleDev;

import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.example.automation.utils.commonUtils.APIUtils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class APITests {

    private static final Logger log = LogManager.getLogger(APITests.class);
    
    @Test
    void getUsersAPITest() {
        // This is a placeholder for an API test
        // Implement your API test logic here
        APIUtils apiUtils = new APIUtils();
        String url = "https://dummy.restapiexample.com/api/v1/employees";
        
        //Example GET request
        Response getResponse = apiUtils.sendGetRequest(url);
        //System.out.println("GET Response: " + getResponse.asString());
        JsonPath jsonPath = getResponse.jsonPath();
        int employeeCount = jsonPath.getInt("data.size()");
        log.info("Running sample API test with employee count: " + employeeCount);
        log.info("GET API Test Passed");
    }
}
