package Chap5_Single;

/**
 * Created by Citrix on 2018/12/3.
 */
public class ChocolateBoiler {
    private static ChocolateBoiler uniqueInstance;//注意得是static
    private boolean empty;
    private boolean boiled;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getUniqueInstance() {//注意得是static
        if (uniqueInstance == null) {
            uniqueInstance = new ChocolateBoiler();
        }
        return uniqueInstance;
    }
    public void fill(){
    }
}
