public class OOPSBannerApp6 {

    // Method for 'O'
    public static String[] getOPattern() {
        return new String[]{
            "  ***  ",
            " *   * ",
            "*     *",
            "*     *",
            "*     *",
            " *   * ",
            "  ***  "
        };
    }

    // Method for 'P'
    public static String[] getPPattern() {
        return new String[]{
            "****** ",
            "*     *",
            "*     *",
            "****** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method for 'S'
    public static String[] getSPattern() {
        return new String[]{
            " ******",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            "****** "
        };
    }

    public static void main(String[] args) {
        // Get patterns for O, O, P, S
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Print the banner “OOPS”
        for (int i = 0; i < o1.length; i++) {
            System.out.println(o1[i] + "   " + o2[i] + "   " + p[i] + "   " + s[i]);
        }
    }
}