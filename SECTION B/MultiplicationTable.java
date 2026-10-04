//Write a program that reads a number and prints its multiplication table from 1 to 10. 
import java.util.*;
public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt();
        System.out.println("Enter the no." + n);
        for(int i=1;i<=10;i++){
            int ans = n*i;
            System.out.println(n +"x"+ i +"="+ ans);
        }
    }
} 