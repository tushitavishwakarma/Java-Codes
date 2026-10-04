import java.util.*;
public class HarshadNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int sum =0;
        int dummy =n;
        while(n>0){
            int digit = n%10;
            sum = sum+digit;
            n/=10;
        }
        if(dummy%sum==0){
            System.out.println(dummy + " is a Harshad number");
        }
        else{
            System.out.println(dummy + " is not a Harshad number");
        }
    }
}