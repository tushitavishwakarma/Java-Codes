import java.util.*;
public class CheckPosNegative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("You entered: " + n);
        if(n>0){
            System.out.println("The number is positive");
        }
        else if(n<0){
            System.out.println("The number is negative");
        }
        else{
            System.out.println("The number is zero");
        }
    }
}