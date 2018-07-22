import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Write your main program here. Implementing your own classes will be very useful.
        Scanner reader = new Scanner(System.in);
        Tournament tournament = new Tournament();
        TextUserInterface UserInterface = new TextUserInterface(tournament, reader);
        UserInterface.start();
        
    }
}
