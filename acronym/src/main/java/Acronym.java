import java.lang.reflect.Array;

class Acronym {

    String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    // Parse through string and find the first letter of each word. Capitalize it and then use a StringBuilder to string them together
    // How do I know if something is a word? If there exists a space or "-".
    String get() {
        String myWords [] = phrase.split("[- ]");
        StringBuilder result = new StringBuilder();
        for (String word: myWords) {
            char[] wordChars = word.toCharArray();
            result.append(wordChars[0]);
        }
        return result.toString().toUpperCase();
    }

}
