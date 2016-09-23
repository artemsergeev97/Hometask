/**
 * @autor Sergeev Artem
 * 11-506
 * 013
 */
import java.util.*;

public class Task013 {

    public static void main(String[] args) {

        System.out.println("n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double r = 1.0;
        for (int i=1;i<=n;i++){
            if(i%2!=0){
                r*=(2.0*n)/(2.0*n-1.0);
            }else{
                r*=(2.0*n)/(2.0*n+1.0);
            }
        }

        System.out.println(r);
    }
}
