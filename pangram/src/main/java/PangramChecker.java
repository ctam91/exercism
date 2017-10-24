import java.util.HashMap;

public class PangramChecker {

    public boolean isPangram(String input) {

        HashMap<Character, Boolean> myHashMap = new HashMap<>();

        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        input = input.toLowerCase();

        for(char character : alphabet.toCharArray()){
            if(input.contains(String.valueOf(character))) {
                myHashMap.put(character, true);
            }
            else{
                return false;
            }
        }
        return true;
    }

}
