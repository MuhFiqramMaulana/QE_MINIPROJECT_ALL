package Starter.Project;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class Login {
    private String url;
    private JSONObject body = new JSONObject();
    public void setUrlLogin() {
        url = "https://alta-shop.herokuapp.com/api/auth/login";
    }

    public void requestToLoginWithValidAccount() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void setInvalidBodyAccount() {
        body.put("email", "fiqram@upi.edu");
        body.put("password","ganteng10");
    }

    public void setValidBodyDataAccount() {
        body.put("email", "fiqram@gmail.com");
        body.put("password", "ah10");
    }

    public void setUrlLoginForInvalidAccount() {
        url ="https://alta-shop.herokuapp.com/api/auth/login";
    }

    public void requestToLoginWitInvalidBody() {
        given().header("content-type", "application/json")
                .body(body.toJSONString())
                .when().post(url);
    }
}
