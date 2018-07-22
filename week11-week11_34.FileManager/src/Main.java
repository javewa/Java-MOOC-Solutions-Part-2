
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
        public static void main(String[] args) throws FileNotFoundException, IOException {
        FileManager f = new FileManager();

        f.save("src/testinput1.txt", f.read("src/testinput2.txt"));
    }
}
