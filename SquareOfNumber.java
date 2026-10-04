import java.util.*;

public class SquareOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no");
        int base  = sc.nextInt();
        System.out.println("Base is" + base);
        System.out.println("Enter The power");
        int expo  = sc.nextInt();
        System.out.println("Base is" + expo);
        int product = 1;
        for(int i =0; i<expo;i++){
            product = product * base;
        }
        System.out.println(product);
    }
}