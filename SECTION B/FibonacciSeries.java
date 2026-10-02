import java.util.*;
public class FibonacciSeries{
    public static void main(String[] args){
        System.out.println("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter no. : " + n);

        int a=0, b=1;
        System.out.print(a + " " + b + " ");
        for (int i=2; i<n; i++){
            int c = a+b;
            System.out.print(c + " ");
            a=b;
            b=c;
        }
    }
}