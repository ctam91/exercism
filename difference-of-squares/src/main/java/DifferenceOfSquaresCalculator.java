
public class DifferenceOfSquaresCalculator {

    public int computeSquareOfSumTo(int number){
        int result = 0;
        for(int i = 0; i <= number; i ++){
            result += i;
        }
        return result*result;
    }

    public int computeSumOfSquaresTo(int number){
        int result = 0;
        for(int i = 0; i <= number; i++){
            result += i * i;
        }
        return result;
    }

    public int computeDifferenceOfSquares(int number){
        return computeSquareOfSumTo(number) - computeSumOfSquaresTo(number);
    }
}
