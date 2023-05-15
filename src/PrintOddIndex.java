import java.util.Arrays;

public class PrintOddIndex {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 9, 10, 15};
        int[] loopNo = new int[numbers.length];
        oddIndex(numbers, loopNo);
    }

    private static void oddIndex(int[] numbers, int[] loopNo) {
        for(int index = 0; index < numbers.length; index++){
            if(index % 2 == 1){
                loopNo[index] = numbers[index];
            }
        }
        System.out.println(Arrays.toString(loopNo));
    }
}
