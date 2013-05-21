package controllers;

import java.util.HashMap;
import java.util.Map;

import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class RestExampleController extends Controller {

	public static Result getExampleJsonResponse() {

		Map<String, String> responseMap = new HashMap<>();
		responseMap.put("res", "something!");

		return ok(Json.toJson(responseMap));
	}

}
