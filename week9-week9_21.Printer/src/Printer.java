/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Printer {
    
    private File fileName;
    private Scanner reader;
    
    public Printer(String filename) throws Exception{
        this.fileName = new File(filename);
    }
    
    public void printLinesWhichContain(String word) throws FileNotFoundException {       
        reader = new Scanner(this.fileName);
        while (reader.hasNextLine()) {
            String line =  reader.nextLine();
            if (line.contains(word)) {
                System.out.println(line);
            }
        }
        reader.close();
    }
}

