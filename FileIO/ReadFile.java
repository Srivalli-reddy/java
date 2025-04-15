package FileIO;
import java.io.FileReader;

public class ReadFile {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("test.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}

