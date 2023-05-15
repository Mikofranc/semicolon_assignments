import java.util.Arrays;

public class PrintEvenIndex {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 9, 10, 15};
        int[] loopNo = new int[numbers.length];
        getEvenIndex(numbers, loopNo);
    }

    private static void getEvenIndex(int[] numbers, int[] loopNo) {
        for(int index = 0; index < numbers.length; index++){
            if(index % 2 == 0){
                loopNo[index] = numbers[index];
            }
        }
        System.out.println(Arrays.toString(loopNo));
    }
}
