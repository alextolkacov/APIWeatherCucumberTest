package testDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import org.junit.Assert;

public class WeatherStepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;

    @When("we are getting weather from server")
    public void get_weather(){
        response = weatherRequester.getWeather();
    }

    @Then("id is (.*)")
    public void check_id(String id){
        Assert.assertEquals("Wrong id", id, response.getWeather().getId());
    }

    @Then("main is (.*)")
    public void check_main(String main){
        Assert.assertEquals("Wrong main", main, response.getWeather().getMain());
    }

    @Then("description is (.*)")
    public void check_description(String description){
        Assert.assertEquals("Wrong description", description, response.getWeather().getDescription());
    }

    @Then("icon is (.*)")
    public void check_icon(String icon){
        Assert.assertEquals("Wrong icon", icon, response.getWeather().getIcon());
    }
}
