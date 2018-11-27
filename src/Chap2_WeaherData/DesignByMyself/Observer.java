package Chap2_WeaherData.DesignByMyself;

/**
 * Created by Citrix on 2018/11/27.
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
