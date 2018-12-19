package Chap8_Template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Citrix on 2018-12-19.
 */
public class CaffeineWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    public boolean customerWants() {
        String ans = getUserInput();
        if (ans.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String ans = null;
        System.out.println("(y/n)?");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            ans = in.readLine();
        } catch (IOException ioe) {
            System.err.println("error");
        }
        if (ans == null) {
            return "no";
        }
        return ans;
    }

}
