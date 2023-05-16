import java.util.Scanner;

public class CheckForPalindrome {
    public static void main(String[] args) {
        System.out.println("enter word to check it its a palindrome");
        Scanner scanner = new Scanner(System.in);
        String initialName = scanner.next();
      String name = initialName.toLowerCase();

      char[] reverseName = new char[name.length()];
        int position =0;
        int indexToCheckPalindrome =0;
        wordReversal(name, reverseName, position);
        for( indexToCheckPalindrome =0; indexToCheckPalindrome < name.length(); indexToCheckPalindrome++){
          if (name.charAt(indexToCheckPalindrome) != reverseName[indexToCheckPalindrome]){
              System.out.println(name +"  is not a palindrome !!!!");
              break;
          }
      }
      if (indexToCheckPalindrome == name.length()) System.out.println("hurray " +name + " is a palindrome");
    }

    private static void wordReversal(String name, char[] reverseName, int position) {
        for(int index = name.length()-1; index >= 0; index--){
            reverseName[position] = name.charAt(index);
            position++;
        }
    }

}

