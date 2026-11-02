public class ProblemThree {

    public static void printFibonacci() {
        int a = 0, b = 1;
        int count = 100;
        for(int i = 0; i <= count; i++) {
            System.out.printf("%d, ", a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        printFibonacci();
    }
}
