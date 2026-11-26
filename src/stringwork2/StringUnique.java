package stringwork2;

import java.util.HashSet;

public class StringUnique {
    public static int foundUnique(String text) {
        text = deleteSpace(text);
        if (text.isEmpty()) {
            return 0;
        }
        String[] textArray = text.split(" ");
        HashSet<String> set = new HashSet<>();
        for (String element : textArray) {
            set.add(element.toLowerCase());
        }

        return set.size();
    }

    private static String deleteSpace(String text) {
        text = text.strip();
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }
        return text;
    }
}
