public class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {

        char[] leftArray = leftStrand.toCharArray();
        char[] rightArray = rightStrand.toCharArray();

        if(leftArray.length != rightArray.length){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        int counter = 0;
        for(int i =0; i < leftArray.length; i++){
            if(leftArray[i] == rightArray[i]){
                counter += 0;
            }
            else{
                counter += 1;
            }
        }
        return counter;
    }

}
