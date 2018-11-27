package Chap2_WeaherData.DesignByJava;

import java.util.Observable;

/**
 * Created by Citrix on 2018/11/27.
 */
public class WeatherData extends Observable {//用了继承的方式而不是接口，其实不合理
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
    }

    /*
     * 先指示状态发送了改变，再通知
     * */
    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    /*
     * 留给订阅者查询的函数
     * */
    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
