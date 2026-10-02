import java.util.*;
public class LargestOfTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
        System.out.println("Enter another number");
        int m = sc.nextInt();
        System.out.println("You entered: " + m);
        if(n>m){
            System.out.println("The largest number is: " + n);
        }
        else{
            System.out.println("The largest number is: " + m);
        }
    }
}