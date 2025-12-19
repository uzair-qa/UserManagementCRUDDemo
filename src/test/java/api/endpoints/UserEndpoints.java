package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class UserEndpoints {

	public static Response createUser(User payload) {
		return given()
				.header("x-api-key", "reqres_77258d9c08154a748e1af233112280ab")
				.contentType(ContentType.JSON)
				.body(payload)
		.when()
				.post("https://reqres.in/api/users");
	}
	
	public static Response getUser(int userId) {
		return given()
				.header("x-api-key", "reqres_77258d9c08154a748e1af233112280ab")
		 .when()
					.get("https://reqres.in/api/users/" + userId);
	}
	
	public static Response updateUser(int userId, User payload) {
		return given()
				.header("x-api-key", "reqres_77258d9c08154a748e1af233112280ab")
				.contentType(ContentType.JSON)
				.body(payload)
		.when()
				.put("https://reqres.in/api/users/" + userId);
	}
	
	public static Response deleteUser(int userId) {
		return given()
				.header("x-api-key", "reqres_77258d9c08154a748e1af233112280ab")
		 .when()
					.delete("https://reqres.in/api/users/" + userId);
	}
}

