public class UC6 {

    // Method to build line with two O's
    static String buildOO(String part1, String part2) {
        return String.join(" ", part1, part2);
    }

    // Method to build line with P
    static String buildP(String part) {
        return part;
    }

    // Method to build line with S
    static String buildS(String part) {
        return part;
    }

    public static void main(String[] args) {

        String[] banner = {
            String.join(" ", buildOO(" *** ", " *** "), buildP(" **** "), buildS(" ***** ")),
            String.join(" ", buildOO("*   *", "*   *"), buildP("*   * "), buildS("*     ")),
            String.join(" ", buildOO("*   *", "*   *"), buildP(" **** "), buildS(" ***** ")),
            String.join(" ", buildOO("*   *", "*   *"), buildP("*     "), buildS("*     ")),
            String.join(" ", buildOO(" *** ", " *** "), buildP("*     "), buildS(" ***** "))
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}