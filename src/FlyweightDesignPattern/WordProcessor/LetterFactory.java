package FlyweightDesignPattern.WordProcessor;

import java.util.HashMap;
import java.util.Map;

public class LetterFactory {
    private static Map<Character,ILetter> characterCache = new HashMap<>();
    public static ILetter createLetter(char characterValue) {
        if (characterCache.containsKey(characterValue)) {
            return characterCache.get(characterValue);
        }
        else {
            DocumentLetter documentLetter = new DocumentLetter(characterValue,"Arial,",10);
            characterCache.put(characterValue,documentLetter);
            return documentLetter;
        }
    }
}
