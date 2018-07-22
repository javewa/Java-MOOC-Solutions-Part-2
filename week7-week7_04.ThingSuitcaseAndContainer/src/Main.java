
public class Main {

    public static void main(String[] args) {
        // use this main class to test your program!
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
        container.printThings();
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        // adding 100 suitcases with one brick in each
        int c = 1;
        for (int i = 0; i < 100; i++) {
            Thing brick = new Thing("Brick", c);
            Suitcase suitcase = new Suitcase(120);
            suitcase.addThing(brick);
            container.addSuitcase(suitcase);
            if (c < 100) {
                c += 1;
            }
        }
    }
}
    


