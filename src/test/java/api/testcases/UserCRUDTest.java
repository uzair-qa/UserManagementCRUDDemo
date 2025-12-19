package api.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import io.restassured.response.Response;

public class UserCRUDTest {

	int userId;
	
	@Test(priority = 1)
	public void createUserTest() {
		User payload = new User();
		payload.setName("Uzair");
		payload.setJob("QA Lead");
		
		Response response = UserEndpoints.createUser(payload);
		response.then().log().all();
		
		Assert.assertEquals(response.getStatusCode(), 201);
		
		userId = response.jsonPath().getInt("id");
		System.out.println("Created User ID: " + userId);
	}
	
	@Test(priority = 2)
	public void getUserTest() {
		Response response = UserEndpoints.getUser(2);
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 200);
	}
	
	@Test(priority = 3)
	public void updateUserTest() {
		User payload = new User();
		payload.setName("Uzair Khan");
		payload.setJob("Senior SDET");
		
		Response response = UserEndpoints.updateUser(userId, payload);
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 200);
		Assert.assertEquals(response.jsonPath().getString("job"), "Senior SDET");
	}
	
	@Test(priority = 4)
	public void deleteUserTest() {
		Response response = UserEndpoints.deleteUser(2);
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(), 204);
	}
	
}
