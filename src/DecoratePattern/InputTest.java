package DecoratePattern;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) throws IOException {

        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));

            while((c=in.read())>=0) {
                System.out.println((char)c);//스트림을 써서 파일 끝가지 문자를 하나씩 출력하면서 처리한다.
            }
            in.close();

        }catch(IOException e) {
            e.printStackTrace();

        }
    }
}
