public class Main {
    public static void main(String[] args) {
        // Test your code here!
        MilitaryService service = new MilitaryService(53);
        System.out.println(service.getDaysLeft());
        service.work();
        System.out.println(service.getDaysLeft());

    }
}
