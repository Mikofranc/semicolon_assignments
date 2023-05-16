import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 9, 10, 15};
        ArrayReversal(numbers);
    }

    private static void ArrayReversal(int[] numbers) {
        int listIncreasmentStartPoint=5;
        int iteration =0;
        int[] containerForReversal = new int[numbers.length];
        for(int index = numbers.length-1; index >= 0; index--){
            iteration= listIncreasmentStartPoint -index;
            containerForReversal[iteration] = numbers[index];
        }
        System.out.println(Arrays.toString(containerForReversal));

    }
}
