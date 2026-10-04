import java.util.*;
public class StrongNo{
    public static void main(String[] args){
        System.out.println("enter the no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter no. : " + n);

     int dum = n;
        
        int sum = 0;
        while(n>0){
int product =1;
            int ld = n%10;
   for (int i  = 1 ; i <= ld ; i++){
            product = product*i;
        }
        sum = sum + product;
        n = n/10;

        }
     if(sum == dum){
        System.out.println("The no. is Strong Number" + sum);
     }
     else{
       System.out.println("The no. is not a Strong Number" + sum); 
     }

    }
}