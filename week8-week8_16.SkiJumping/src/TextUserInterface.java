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


public class TextUserInterface {
    
    private Tournament tournament;
    private Scanner reader;
    
    public TextUserInterface(Tournament tournament, Scanner reader) {
        this.tournament = tournament;
        this.reader = reader;
    }
    
    public void start() {
        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        while (true) {
            System.out.print("  Participant name: ");
            String input = reader.nextLine();
            if (input.equals("")) {
                break;
            } else {
                tournament.addJumper(input);
            }      
        }
        System.out.println("\n");
        System.out.println("The tournament begins!\n");
        
        int c = 1;
        
        while (true) {
            System.out.print("Write \"jump\" to jump; otherwise you quit: ");
            System.out.println("");
            String input = reader.nextLine();
            if (!input.equals("jump")) {
                break;
            } else {
                System.out.println("");
                System.out.println("Round " + c + "\n");
                tournament.orderJumpers();
                System.out.println("Jumping order:");
                tournament.orderJumpers();
                System.out.println(tournament);
            
                System.out.println("Results of round " + c);
                System.out.println(tournament.jumpJumpers());   
                c += 1;
            }
        }
        
        tournament.orderJumpers();
        System.out.println("Thanks!\n");
        
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        System.out.println(tournament.results());
        
    }
    
}
