/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author nacht
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Analysis {
    
    private File file;
    
    public Analysis(File file) throws Exception{
        this.file = file;
    }
    
    public int lines() throws FileNotFoundException {
        int c = 0;
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            c += 1;
            String line = reader.nextLine();
        }
        return c;
    }
    
    public int characters() throws FileNotFoundException {
        int c = 0;
        Scanner reader = new Scanner(file);
        while (reader.hasNext()) {
            String line = reader.nextLine();
            c += line.toCharArray().length;
            c += 1;
        }
        return c;
    }
    
}
