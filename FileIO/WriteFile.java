package FileIO;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("test.txt");
        writer.write("Hello, file!");
        writer.close();
        System.out.println("Written to file.");
    }
}

