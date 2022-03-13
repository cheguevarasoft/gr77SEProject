package seminarstudent;

public class City {

    int cityId;
    String CityName;
    int population;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return CityName;
    }

    public void setCityName(String cityName) {
        CityName = cityName;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityId=" + cityId +
                ", CityName='" + CityName + '\'' +
                ", population=" + population +
                '}';
    }
}
