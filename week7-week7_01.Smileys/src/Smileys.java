
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
        printWithSmileys("\\:D/");
        printWithSmileys("Mikael");
        printWithSmileys("Arto");
        printWithSmileys("Matti");
    }
    
    private static void printWithSmileys(String word) {
        System.out.print(smileyLine(word));
        System.out.print("\n");
        if (word.length() % 2 == 0) {
            System.out.print(":) " + spaceString(word) + word + spaceString(word) + " :)\n");
        } else { 
            System.out.print(":) " + spaceString(word) + word + spaceString(word) + "  :)\n");
        }
        System.out.print(smileyLine(word) + "\n");
    }
    
    private static String smileyLine(String word) {
        String myString = "";
        if (word.length() % 2 == 0 && word.length() <= 4) {
            for (int i = 0; i < word.length() + 1; i++) {
                myString += ":)";
            }
        } else if (word.length() % 2 == 0 && word.length() > 4) {
            for (int i = 0; i < word.length(); i++) {
                myString += ":)";
            }
        } else {
            for (int i = 0; i < word.length() + 1; i++) {
                myString += ":)";
            }
        }
        return myString;
    }
    
    private static String spaceString(String word) {
       String spaces = "";
       for (int i = 0; i < word.length()/2 - 3; i++) {
           spaces += " ";
       }
       return spaces;
    }

}
