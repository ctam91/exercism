class Scrabble {

    String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        int result = 0;
        char [] charArray = word.toUpperCase().toCharArray();
        for(Character c : charArray) {
            switch (c){
                case 'A': case 'E': case 'I': case 'O': case 'U': case 'L': case 'N' : case 'R': case 'S': case 'T':
                    result += 1;
                    break;
                case 'D': case 'G':
                    result += 2;
                    break;
                case 'B': case 'C': case 'M': case 'P':
                    result += 3;
                    break;
                    //F, H, V, W, Y
                case 'F': case 'H': case 'V': case 'W': case 'Y':
                    result += 4;
                    break;
                case 'K':
                    result += 5;
                    break;
                case 'J': case 'X':
                    result += 8;
                    break;
                case 'Q': case 'Z':
                    result += 10;
                    break;
                default:
                    result = 0;
                    break;
            }
        }
        return result;
    }

}
