package DecoratorsPatternWithStarbuzzCafe.CustomInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class CustomInputStreamTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in = new CustomInputStream(new BufferedInputStream(new FileInputStream("DecoratorsPatternWithStarbuzzCafe/CustomInputStream/test.txt")));

            while((c=in.read()) >=0 ){
                System.out.print((char) c);
            }

            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
