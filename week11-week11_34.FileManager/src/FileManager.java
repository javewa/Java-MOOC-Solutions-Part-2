
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
        
    public List<String> read(String file) throws FileNotFoundException {
        List<String> lines = new ArrayList<String>();
        File myFile = new File(file);
        Scanner reader = new Scanner(myFile);
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            lines.add(line);
        }
        reader.close();
        return lines;   
    }

    public void save(String file, String text) throws IOException {
        File myFile = new File(file);
        FileWriter writer = new FileWriter(myFile);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        File myFile = new File(file);
        FileWriter writer = new FileWriter(myFile);
        for (String text : texts) {
            writer.write(text);
            writer.write("\n");
        }
        writer.close();
    }
}
