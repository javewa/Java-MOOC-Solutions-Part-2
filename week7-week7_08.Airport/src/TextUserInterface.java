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
    
    private Scanner reader;
    private Airport airport;
    
    public TextUserInterface(Scanner reader, Airport airport) {
        this.reader = reader;
        this.airport = airport;
    }
    
    public void start() {
        
        System.out.println("Airport panel\n--------------------\n");

        while (true) {
            System.out.println("Choose operation:\n[1] Add airplane\n[2] Add flight\n[x] Exit");
            System.out.print("> ");
            String input = reader.nextLine();
            if (input.equals("1")) {
                System.out.println("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println("Give plane capacity: ");
                int capacity = Integer.parseInt(reader.nextLine());
                airport.addPlane(new Plane(planeID, capacity));
            } else if (input.equals("2")) {
                System.out.println("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println("Give departure airport code: ");
                String departureCode = reader.nextLine();
                System.out.println("Give destination airport code: ");
                String destinationCode = reader.nextLine();
                airport.addFlight(new Flight(airport.planeSearch(planeID), departureCode, destinationCode));
            } else if (input.equals("x")) {
                break;
            } 
        }   
        
        System.out.println("Flight service\n------------\n");

        while (true) {
            System.out.println("Choose operation:\n[1] Print planes\n[2] Print flights\n[3] Print plane info\n[x] Quit");
            System.out.print("> ");
            String input = reader.nextLine();
            if (input.equals("1")) {
                System.out.println(airport.returnPlanes());
            } else if (input.equals("2")) {
                System.out.println(airport.returnFlights());
            } else if (input.equals("3")) {
                System.out.println("Give plane ID: ");
                String planeID = reader.nextLine();
                System.out.println(airport.planeSearch(planeID));
            } else if (input.equals("x")) {
                break;
            }  
        }
    }
    
}
