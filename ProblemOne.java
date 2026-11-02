class ProblemOne {

    public static int useForLoop(int[] numArray) {
        int sum = 0;
        for(int num : numArray) {
            sum += num;
        }
        return sum;
    }

    public static int useWhileLoop(int[] numArray) {
        int sum = 0;
        int count = 0;
        while(count <= numArray.length - 1) {
            sum += numArray[count];
            count++;
        }
        return sum;
    }

    public static int useRecursion(int[] numArray, int index, int sum) {
        sum += numArray[index];
        if(index == 0) {
            return sum;
        }
        return useRecursion(numArray, index - 1, sum);
    }

    public static void main(String[] args) {

        int[] numArray = {1, 2, 3, 4, 5};
        int forLoopAnswer = useForLoop(numArray);
        int whileLoopAnswer = useWhileLoop(numArray);
        int recursionAnswer = useRecursion(numArray, numArray.length - 1, 0);
        System.out.printf("For Loop Answer: %d\nWhile Loop Answer: %d\nRecursion Answer: %d", forLoopAnswer, whileLoopAnswer, recursionAnswer);
    }
}