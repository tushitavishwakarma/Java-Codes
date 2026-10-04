import java.util.*;

public class SumOfNatural{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The NO.");
        int n = sc.nextInt();
        int sum = n*(n+1);
        int ans = sum/2;
        System.out.println(ans);
        
    }
}