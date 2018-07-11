package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamExp {
    static int i;

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/iostream/TEXT.TXT");
        } catch (FileNotFoundException e) {
            System.out.println("No such file present");
            return;
        }
        do {
            try {
                i = fis.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                System.out.println("No data present ");
            }
        } while (i != -1);
    }
}
