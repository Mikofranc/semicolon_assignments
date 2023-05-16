public class CheckIfElementIsPresent {
    public static void main(String[] args) {
        int[] numbers = {4, 2, 8, 9, 10, 15};
        int[] loopNo = new int[numbers.length];
        int availableNo = 100;
        int noOfInteration =1;
        int checkIfPresent =0;
        checkForSimilarElements(numbers, loopNo, availableNo, checkIfPresent);
    }

    private static void checkForSimilarElements(int[] numbers, int[] loopNo, int availableNo, int checkIfPresent) {
        for(int index = 0; index < numbers.length; index++){
            loopNo[index] = numbers[index];
            if(loopNo[index] == availableNo){
                checkIfPresent++;
            }
        }
        if (checkIfPresent >0) System.out.println("the element is present in the list");
        else System.out.println("the element is not present in the list");
    }
}
