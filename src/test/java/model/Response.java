package model;

public class Response {
    private Coord coord;
    private Weather weather;
    private Main main;

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

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
