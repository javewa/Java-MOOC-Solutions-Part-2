/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nacht
 */
public class Calculator {
    
    private int counter = 0;
    
    private Reader reader = new Reader();
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }
            if (command.equals("sum")) {
                counter += 1;
                sum();
            } else if (command.equals("difference")) {
                counter += 1;
                difference();
            } else if (command.equals("product")) {
                counter += 1;
                product();
            }
        }

        statistics();
    }
    
    private void sum() {
        System.out.println("value1:");
        int value1 = reader.readInteger();
        System.out.println("value2:");
        int value2 = reader.readInteger();
        System.out.println("sum of the values" + (value1 + value2));
    }
    
    private void difference() {
        System.out.println("value1:");
        int value1 = reader.readInteger();
        System.out.println("value2:");
        int value2 = reader.readInteger();
        System.out.println("difference of the values" + (value1 - value2));
    }
    
    private void product() {
        System.out.println("value1:");
        int value1 = reader.readInteger();
        System.out.println("value2:");
        int value2 = reader.readInteger();
        System.out.println("product of the values" + (value1 * value2));
    }
    
    private void statistics() {
        System.out.println("Calculations done " + counter);
    }
    
}
