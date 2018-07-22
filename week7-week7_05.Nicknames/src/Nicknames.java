
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Do the operations requested in the assignment here!
        HashMap <String, String> usernames = new HashMap<String, String>();
        usernames.put("matti", "mage");
        usernames.put("mikael", "mixu");
        usernames.put("arto", "arppa");
        System.out.println(usernames.get("mikael"));
    }

}
