public class SumWithWhileLoop {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 9, 10, 15};
        int[] loopNo = new int[numbers.length];
        int sum =0;
        CalculatingTheSumTotal(numbers, sum);
    }

    private static void CalculatingTheSumTotal(int[] numbers, int sum) {
        int index = 0;
        while ( index < numbers.length){
            sum += numbers[index];
            index++;
        }
        System.out.println(sum);
    }
}
