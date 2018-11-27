package Chap2_WeaherData.DesignByMyself;

/**
 * Created by Citrix on 2018/11/27.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
