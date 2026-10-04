import java.util.*;
public class AutomorphicNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
      int square = n*n;
      int ld= square%10;
      int ld1= n%10;
      if(ld==ld1){
        System.out.println(n+ "is a Automorphic number");
      }
      else{
        System.out.println(n+ "is not a Automorphic number");
      }
    }
}