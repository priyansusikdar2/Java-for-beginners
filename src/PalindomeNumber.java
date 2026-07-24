import java.util.Scanner;

class Palindrome {

    void checkPalindrome() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int original = num;
        int reverse = 0;

        while (num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number");
        } else {
            System.out.println(original + " is Not a Palindrome Number");
        }
    }
}

public class PalindomeNumber {

    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        p.checkPalindrome();
    }
}
