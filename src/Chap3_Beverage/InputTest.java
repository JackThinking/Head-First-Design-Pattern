package Chap3_Beverage;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Citrix on 2018/11/28.
 */
public class InputTest {
    public static void main(String[] args) throws IOException{
        int c;
        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("test.txt")
                            )
                    );
            while ((c = in.read()) <= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();//这边也处理了，和抛出岂不是冗余了
        }
    }
}
