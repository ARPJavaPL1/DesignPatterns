package designpatterns.decorator.lowercasereader;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStreamApp {
    public static void main(String[] args) {
        try {

            String filePath = "file.txt";
            InputStream inputStream =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream(filePath)
                            )
                    );
            int c;
            while ((c = inputStream.read()) >= 0) {
                System.out.println((char)c);
            }

            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
