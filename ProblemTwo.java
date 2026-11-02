
import java.util.ArrayList;

public class ProblemTwo {

    public static void combineLists(String[] listFirst, String[] listSecond) {
        ArrayList<String> combinedList = new ArrayList<>();
        for(int i = 0; i < listFirst.length; i++) {
            combinedList.add(listFirst[i]);
            combinedList.add(listSecond[i]);
        }
        System.out.printf("Combined List: %s\n", String.join(", ", combinedList));
    }
    
    public static void main(String[] args) {

        String[] listFirst = {"a", "b", "c"};
        String[] listSecond = {"1", "2", "3"};
        combineLists(listFirst, listSecond);
    }
}
