import java.util.*;
public class ReverseNo{
    public static void main(String[] args){
        System.out.println("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter no. : " + n);

        int reverse = 0;
        while(n!=0){
            int digit = n%10;
            reverse = reverse*10 + digit;
            n/=10;
        }
        System.out.println("the reverse no. is : " + reverse);
    }
}