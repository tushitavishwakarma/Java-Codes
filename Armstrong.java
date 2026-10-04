
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.");
        int n = sc.nextInt(); //n = 153
        System.err.println("Entered the NO. : " + n);
        int count = 0; //c = 0
        int dummy = n; //dummy = 153
        while(n > 0){
            count++;
            n = n / 10;
        } //n = 0
        n = dummy; //n = 153
        int sum = 0; //sum = 0
        while(dummy > 0){
            int ld = dummy % 10;
            int pow = 1;
            for(int i = 1; i<=count; i++){
                pow = pow * ld;
            }
            sum = sum + pow;
            dummy = dummy / 10;
        } //used //dummy = 0, sum = 153
        if(n == 0){ //false
            System.out.println(false);
            System.out.println(0);
        }
        else if(sum == n){ //
            System.out.println(true);
            System.out.println(count);
        }
        else{
            System.out.println(false);
            System.out.println(count);
        }
    }
}
