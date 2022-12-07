public class deneme {

    /**
     * A helper function which removes non-alphabetic characters,
     * converts to a lower case and trims the string.
     *
     * @param str input string
     * @return a string with non-alphabetic characters removed
     */
    private static String[] splitWords(String str) {
        return str
                .toLowerCase().replaceAll("([^a-z])", " ")
                .replaceAll(" +", " ")
                .trim().split(" ");
    }

    /**
     * Camel Case function.
     *
     * @param str input string
     * @return a string in proper camel case format
     */
    private static String camelCase(String str) {
        StringBuilder camel = new StringBuilder();
        String[] words = splitWords(str);
        int index = 0;
        for (String word : words) {
            if (index == 0) {
                camel.append(word);
            } else {
                camel.append(word.substring(0, 1).toUpperCase()).append(word.substring(1));
            }
            index++;
        }
        return camel.toString();
    }

    /**
     * Entry point.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        var result1 = camelCase("_good_looking_blues_");
        System.out.println(result1);

        var result2 = camelCase("-=last-night-on-earth=-");
        System.out.println(result2);

    }

}
