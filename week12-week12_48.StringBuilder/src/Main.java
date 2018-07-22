import java.lang.StringBuilder;

public class Main {

    public static void main(String[] args) {
        int[] t = {1, 2, 3, 4, 5};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder builder = new StringBuilder();
        builder.append("{\n");
        int c = 0;
        while (c < t.length) {
            if (t.length - c < 4) {
                for (int i = c; i < t.length; i++) {
                    if (i == t.length - 1) {
                        builder.append(" " + t[i]);
                    } else {
                        builder.append(" " + t[i] + ",");
                    }
                }
                break;
            } else {
                for (int i = 0; i < 4; i++) {
                    if (c == t.length - 1) {
                        builder.append(" " + t[c]);
                    } else {
                        builder.append(" " + t[c] + ",");
                    }
                    c++;
                }
                if (c < t.length) {
                    builder.append("\n");
                }
            }
        }
        
        builder.append("\n}");

        return builder.toString();
    }
}
