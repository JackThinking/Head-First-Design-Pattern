package Chap3_Beverage;

/**
 * Created by Citrix on 2018/11/28.
 */
public abstract class CondimentDecorator extends Beverage {
   /*
   * 父类实现了具体方法，子类继承后把他变成abstract是啥意思？
   * */
    public abstract String getDescription();
}
