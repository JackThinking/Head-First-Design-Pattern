package Chap2_WeaherData.DesignByMyself;

/**
 * Created by Citrix on 2018/11/27.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();//主题
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);//订阅者
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
