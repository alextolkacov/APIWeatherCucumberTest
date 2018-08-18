package testDefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Response;
import org.junit.Assert;
import java.math.BigDecimal;
import static junit.framework.TestCase.assertEquals;


public class WeatherStepDefs {
    private WeatherRequester weatherRequester = new WeatherRequester();
    private Response response;

    @When("we are getting coordinates from server")
    public void get_weather(){
        response = weatherRequester.getWeather();
    }
    @Then("lon is (.*)")
    public void check_lon(BigDecimal lon){
        assertEquals("Wrong LON", lon, response.getCoord().getLon());
    }
    @Then("lat is (.*)")
    public void check_lat(BigDecimal lat){
        assertEquals("Wrong LAT", lat, response.getCoord().getLat());
    }
    @Then("id is (.*)")
    public void check_id(String id){
        assertEquals("Wrong id", id, response.getWeather().getId());
    }
    @Then("main is (.*)")
    public void check_main(String main){
        assertEquals("Wrong main", main, response.getWeather().getMain());
    }
    @Then("description is (.*)")
    public void check_description(String description){
        assertEquals("Wrong description", description, response.getWeather().getDescription());
    }
    @Then("icon is (.*)")
    public void check_icon(String icon){
        assertEquals("Wrong icon", icon, response.getWeather().getIcon());
    }
    @Then("base is (.*)")
    public void check_base(String base){
        Assert.assertEquals("Wrong base", base, response.getBase().getBase());
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
    @Then("visibility is (.*)")
    public void check_visibility(BigDecimal visibility){
        assertEquals("Wrong visibility", visibility, response.getVisibility().getVisibility());
    }
    @Then("speed is (.*)")
    public void check_speed(BigDecimal speed){
        assertEquals("Wrong speed", speed, response.getWind().getSpeed());
    }
    @Then("deg is (.*)")
    public void check_deg(BigDecimal deg){
        assertEquals("Wrong deg", deg, response.getWind().getDeg());
    }
    @Then("all is (.*)")
    public void check_all(BigDecimal all){
        assertEquals("Wrong all", all, response.getClouds().getAll());
    }
    @Then("dt is (.*)")
    public void check_dt(BigDecimal dt){
        assertEquals("Wrong dt", dt, response.getDt().getDt());
    }
    @Then("type is (.*)")
    public void check_type(BigDecimal type){
        assertEquals("Wrong type", type, response.getSys().getType());
    }
    @Then("sys id is(.*)")
    public void check_sys_id(BigDecimal sysId){
        assertEquals("Wrong sys id", sysId, response.getSys().getId());
    }
    @Then("message is (.*)")
    public void check_message(BigDecimal message){
        assertEquals("Wrong message", message, response.getSys().getMessage());
    }
    @Then("country is (.*)")
    public void check_country(String country){
        assertEquals("Wrong country", country, response.getSys().getCountry());
    }
    @Then("sunrise is (.*)")
    public void check_sunrise(BigDecimal sunrise){
        assertEquals("Wrong sunrise", sunrise, response.getSys().getSinrise());
    }
    @Then("sunset is (.*)")
    public void check_sunset(BigDecimal sunset){
        assertEquals("Wrong sunset", sunset, response.getSys().getSunset());
    }
    @Then("city id is (.*)")
    public void chech_cuty_id(Integer id){
        assertEquals("Wrong city id", id, response.getId().getId());
    }
    @Then("name is (.*)")
    public void check_name(String name){
        assertEquals("Wrong name", name, response.getName().getName());
    }
    @Then("cod is (.*)")
    public void check_cod(Integer cod){
        assertEquals("Wrong cod", cod, response.getCod().getCod());
    }

}
