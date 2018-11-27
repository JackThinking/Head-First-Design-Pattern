package Chap2_WeaherData.DesignByMyself;

import java.util.ArrayList;

/**
 * Created by Citrix on 2018/11/27.
 */
public class WeatherData implements Subject {
    /*
    * 都是私有变量哦，会让私人变量通知给其他类哦（很神奇哦）
    * */
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    /*
    * 构造函数这么能忘了呀
    * */
    public WeatherData() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) observers.remove(i);
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = (Observer) observers.get(i);//这边为啥变成了Object TODO
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
