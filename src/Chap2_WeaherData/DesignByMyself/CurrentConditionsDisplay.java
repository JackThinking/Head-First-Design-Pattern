package Chap2_WeaherData.DesignByMyself;

/**
 * Created by Citrix on 2018/11/27.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;//我属性里面有主题哦

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);//我注册我自己
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("现在的状况是：" + temperature + "度" + humidity + "%");
    }
}
