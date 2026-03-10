class CharacterPattern {
    char character;
    String[] pattern;

    CharacterPattern(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    String getLine(int index) {
        return pattern[index];
    }
}

public class UC7 {
    public static void main(String[] args) {

        // Pattern for O
        CharacterPattern O = new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // Pattern for P
        CharacterPattern P = new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        });

        // Pattern for S
        CharacterPattern S = new CharacterPattern('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                " *****"
        });

        CharacterPattern[] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            String line = "";
            for (CharacterPattern cp : word) {
                line += cp.getLine(i) + "  ";
            }
            System.out.println(line);
        }
    }
}