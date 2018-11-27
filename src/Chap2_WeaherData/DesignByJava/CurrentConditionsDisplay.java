package Chap2_WeaherData.DesignByJava;

import Chap2_WeaherData.DesignByMyself.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Citrix on 2018/11/27.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;//主题发布者
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    /*
     * 这个参数列表有点晦涩
     * */
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println("现在的状况是：" + temperature + "度" + humidity + "%");
    }
}
