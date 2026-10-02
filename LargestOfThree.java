import java.util.*;
public class LargestOfTwo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
        System.out.println("Enter another number");
        int m = sc.nextInt();
        System.out.println("You entered: " + m);
        System.out.println("Enter a third number");
        int p = sc.nextInt();
        System.out.println("You entered: " + p);
        if(n>m && n>p){
            System.out.println("The largest number is: " + n);
        }
        else if(m>n && m>p){
            System.out.println("The largest number is: " + m);
        }
        else{
            System.out.println("The largest number is: " + p);  
        }
    }
}