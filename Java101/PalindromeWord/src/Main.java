import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;

        System.out.print("Word : ");
        word = input.nextLine();

        if (isPalindrome(word)) {
            System.out.println(word + " is a PALINDROMIC WORD!");
        } else {
            System.out.println(word + " is not a Palindromic word! ");
        }

    }

    public static boolean isPalindrome(String word) {
        int i = 0;

        while((i <= word.length()/2) && (word.charAt(i) == word.charAt(word.length() - i - 1))) {
            System.out.println(i);
            i++;
        }

        return i > (word.length() / 2);
    }

}
