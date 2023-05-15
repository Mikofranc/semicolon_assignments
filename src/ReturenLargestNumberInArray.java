public class ReturenLargestNumberInArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 9, 10, 15};
        int[] largestNo = new int[numbers.length];
        int maxNumber =0;
        getLargestNoInArray(numbers, largestNo, maxNumber);

    }

    private static void getLargestNoInArray(int[] numbers, int[] largestNo, int maxNumber) {
        for (int index = 0; index < numbers.length; index++){
            largestNo[index] = numbers[index];
            if (largestNo[index] > maxNumber){
                maxNumber = largestNo[index];
            }
        }
//        System.out.println(Arrays.toString(largestNo));
        System.out.println(maxNumber);
    }
}
