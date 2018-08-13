package model;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class Response {
    private Coord coord;
    private Weather weather;

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Coord getCoord(){
        return coord;
    }

    public void setCoord(Coord coord){
        this.coord = coord;
    }
}
