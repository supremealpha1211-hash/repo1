import java.util.HashMap;
import java.util.Map;

public class BannerAppUC7 {

    // Static Inner Class
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        String text = "OOPS";

        // Pattern Height = 5
        Map<Character, CharacterPatternMap> patternMap = new HashMap<>();

        patternMap.put('O', new CharacterPatternMap('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPatternMap('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPatternMap('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));

        // Build horizontal banner
        for (int row = 0; row < 5; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : text.toCharArray()) {
                CharacterPatternMap cp = patternMap.get(ch);
                lineBuilder.append(cp.getPattern()[row]).append("  ");
            }

            System.out.println(lineBuilder);
        }
    }
}