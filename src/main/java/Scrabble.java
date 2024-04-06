import java.util.HashMap;
import java.util.Map;

class Scrabble {

    private final int score;
    static Map<Character, Integer> letterValueMap = new HashMap<>();

    static {
        letterValueMap.put('A', 1);
        letterValueMap.put('E', 1);
        letterValueMap.put('I', 1);
        letterValueMap.put('O', 1);
        letterValueMap.put('U', 1);
        letterValueMap.put('L', 1);
        letterValueMap.put('N', 1);
        letterValueMap.put('R', 1);
        letterValueMap.put('S', 1);
        letterValueMap.put('T', 1);

        letterValueMap.put('D', 2);
        letterValueMap.put('G', 2);

        letterValueMap.put('B', 3);
        letterValueMap.put('C', 3);
        letterValueMap.put('M', 3);
        letterValueMap.put('P', 3);

        letterValueMap.put('F', 4);
        letterValueMap.put('H', 4);
        letterValueMap.put('V', 4);
        letterValueMap.put('W', 4);
        letterValueMap.put('Y', 4);

        letterValueMap.put('K', 5);

        letterValueMap.put('J', 8);
        letterValueMap.put('X', 8);

        letterValueMap.put('Q', 10);
        letterValueMap.put('Z', 10);
    }

    Scrabble(String word) {
        score = word.toUpperCase().chars().reduce(0, (acc, letter) -> acc + letterValueMap.get((char) letter));
    }

    int getScore() {
        return score;
    }

}
