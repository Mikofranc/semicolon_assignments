import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 9, 10, 15};
        int[] reverseList = new int[numbers.length];
        int reverseListIncreament = 0;
        ArrayReversal(numbers, reverseList, reverseListIncreament);
    }

    private static void ArrayReversal(int[] numbers, int[] reverseList, int reverseListIncreament) {
        for(int index = numbers.length-1; index > 0; index--){
            reverseListIncreament++;
            reverseList[reverseListIncreament] = numbers[index];
        }
        System.out.println(Arrays.toString(reverseList));
    }
}
