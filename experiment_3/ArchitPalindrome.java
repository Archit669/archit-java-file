import java.util.*;

public class ArchitPalindrome {
    public static int reverse(int num){
        int ans = 0;
        while (num > 0){
            int digit = num % 10;
            ans = ans * 10 + digit;
            num = num / 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number: ");
        int num = sc.nextInt();
        
        if (num == reverse(num)){
            System.out.println(num + " is a palindrome.");
        }else{
            System.out.println(num + " is not a palindrome.");
        }

        sc.close();
    }
}
