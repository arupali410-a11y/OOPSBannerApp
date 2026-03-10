import java.util.HashMap;
import java.util.Map;

class BannerCharacter {
    char character;
    String[] pattern;

    BannerCharacter(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    String getLine(int index) {
        return pattern[index];
    }
}

public class UC8 {

    // Function to render banner
    public static void renderBanner(String word, Map<Character, BannerCharacter> map) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            for (char c : word.toCharArray()) {
                BannerCharacter bc = map.get(c);
                if (bc != null) {
                    System.out.print(bc.getLine(i) + "  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, BannerCharacter> bannerMap = new HashMap<>();

        bannerMap.put('O', new BannerCharacter('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        bannerMap.put('P', new BannerCharacter('P', new String[]{
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
        }));

        bannerMap.put('S', new BannerCharacter('S', new String[]{
                " *****",
                "*     ",
                "*     ",
                " **** ",
                "     *",
                "     *",
                " *****"
        }));

        String word = "OOPS";

        renderBanner(word, bannerMap);
    }
}