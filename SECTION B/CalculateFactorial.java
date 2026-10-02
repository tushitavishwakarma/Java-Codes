import java.util.*;
public class CalculateFactorial{
    public static void main(String[] args){
        System.out.println("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter no. : " + n);

        int product =1;
        for (int i =1 ; i<=n ; i++){
            product = product*i;
        }
        System.out.println("the factorial is : " + product);

    }
}