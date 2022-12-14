package Starter.Project;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;

public class Register {
    private String url;
    private JSONObject body = new JSONObject();
    public void setUrlRegiseter() {
        url = "https://alta-shop.herokuapp.com/api/auth/register";
    }

    public void validBodyData() {
        body.put("email", "fiqram@gmail.com");
        body.put("password","ganteng");
        body.put("full name", "fiqram maulana");
    }

    public void requestToregisterWithValidData() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void getStatusCode200() {
        then().statusCode(200);
    }

    public void requestToRegisterWithInvalidBody() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void getStatusCode400() {
        then().statusCode(400);
    }

    public void setEmailAndPassword() {
        body.put("email","reeeee@gmail.com");
    }

    public void requestToRegister() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void setPasswordAndFullname() {
        body.put("password","maulana10");
        body.put("full name", "seee");
    }

    public void setEmailAndFullname() {
        body.put("email", "asek10@gmail.com");
        body.put("full name", "fiqram maulana");
    }

    public void setEmail() {
        body.put("email", "fiqram@gmail.com");
    }

    public void setPassword() {
        body.put("password","ganteng");
    }

    public void setFullname() {
        body.put("full name", "fiqram maulana");
    }
}
