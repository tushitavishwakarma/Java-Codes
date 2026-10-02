import java.util.*;
public class CheckPalindrome{
    public static void main(String[] args){
        System.out.println("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter no. : " + n);

        int reverse = 0;
        int original = n;
        while(n!=0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n/=10;
        }
        if (original == reverse){
            System.out.println("the no. is palindrome");
        }
        else{
            System.out.println("the no. is not palindrome");
        }
    }
}