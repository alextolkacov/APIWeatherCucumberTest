package testDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;

import java.math.BigDecimal;

import static junit.framework.TestCase.assertEquals;

public class MainStepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;

    @When("we are getting main from server")
    public void get_weather(){
        response = weatherRequester.getWeather();
    }

    @Then("temp is (.*)")
    public void check_temp(BigDecimal temp){
        assertEquals("Wrong temp", temp, response.getMain().getTemp());
    }
    @Then("pressure is (.*)")
    public void check_pressure(BigDecimal pressure){
        assertEquals("Wrong pressure", pressure, response.getMain().getPressure());
    }
    @Then("humidity is (.*)")
    public void check_humidity(BigDecimal humidity){
        assertEquals("Wrong humidity", humidity, response.getMain().getHumidity());
    }
    @Then("temp_min is (.*)")
    public void check_temp_min(BigDecimal temp_min){
        assertEquals("Wrong temp_min", temp_min, response.getMain().getTemp_min());
    }
    @Then("temp_max is (.*)")
    public void check_temp_max(BigDecimal temp_max){
        assertEquals("Wrong temp_max", temp_max, response.getMain().getTemp_max());
    }
}
