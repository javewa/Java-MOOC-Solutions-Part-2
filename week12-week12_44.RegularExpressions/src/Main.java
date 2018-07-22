import java.util.Scanner;


public class Main {
    

    public static void main(String[] args) {
        // write test code here
        System.out.println("Give a string: ");
        Scanner reader = new Scanner(System.in);
        clockTime(reader.nextLine());
    }
    
    public static boolean isAWeekDay(String string) {
        boolean d = false;
        if (string.matches("mon|tue|wed|thu|fri|sat|sun")) {
            d = true;
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
        return d;
    }
    
    public static boolean allVowels(String string) {
        boolean d = false;
        if (string.matches("[aeiouåäö]*")) {
            d = true;
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
        return d;
    }
    
    public static boolean clockTime(String string) {
        boolean d = false;
        if (string.matches("[0-2][0-3]:[0-5][0-9]:[0-5][0-9]")) {
            d = true;
            System.out.println("The form is fine.");
        } else if (string.matches("[0-1][0-9]:[0-5][0-9]:[0-5][0-9]")) {
            d = true;
            System.out.println("The form is fine.");
        } else {
            System.out.println("The form is wrong.");
        }
        return d;
    }
}
