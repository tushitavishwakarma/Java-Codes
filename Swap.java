import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
        System.out.println("Enter another number");
        int m = sc.nextInt();
        System.out.println("You entered: " + m);
        int temp = n;
        n=m;
        m=temp;
        System.out.println("After swapping: ");
        System.out.println("First number: " + n);   
        System.out.println("Second number: " + m);
    }
}