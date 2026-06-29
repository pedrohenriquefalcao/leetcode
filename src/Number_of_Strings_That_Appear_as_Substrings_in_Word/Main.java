package Number_of_Strings_That_Appear_as_Substrings_in_Word;

public class Main {
    class Solution {
        public int numOfStrings(String[] patterns, String word) {
            int contador = 0;

            for (String p : patterns) {
                if (word.contains(p)) {
                    contador++;
                }
            }

            return contador;
        }
    }
}
