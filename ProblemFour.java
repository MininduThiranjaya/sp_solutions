
import java.util.Arrays;

public class ProblemFour {

    public static void findLargestPossibleNumber(int[] numArray) {
        Arrays.stream(numArray).sorted();
        int max = numArray[numArray.length - 1];
        for (int i : numArray) {
            if(i < 10) {
                if(max <= i) {
                    max = i;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int[] numArray = {50, 2, 1, 9};
        findLargestPossibleNumber(numArray);
    }
}
