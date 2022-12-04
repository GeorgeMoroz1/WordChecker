import java.util.*;

public class WordChecker {
    protected String text;
    Set<String> set;


    public WordChecker(String text) {
        this.text = text;
        set = new HashSet<>(List.of(text.split("\\P{IsAlphabetic}+")));

    }

    public boolean hasWord(String words) {
        return set.contains(words);
    }
}
