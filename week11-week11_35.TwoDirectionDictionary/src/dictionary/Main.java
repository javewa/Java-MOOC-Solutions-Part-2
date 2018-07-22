package dictionary;

public class Main {
    public static void main(String[] args) throws Exception {
        // Test your dictionary here
        MindfulDictionary s = new MindfulDictionary("test/words.txt");
        s.load();
        System.out.println(s.translate("olut"));
    }
}
