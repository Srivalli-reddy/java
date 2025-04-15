package FileIO;

import java.io.FileWriter;

public class AppendFile {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("test.txt", true);
        writer.write("\nAppended line.");
        writer.close();
        System.out.println("Appended to file.");
    }
}
