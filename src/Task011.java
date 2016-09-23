/**
 * @autor Sergeev Artem
 * 11-506
 * 011
 */
import java.util.*;

public class Task011 {

    public static void main(String[] args) {

        System.out.println("n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nac = 0;
        int f = 1;
        if(n%2==0){
            nac = 2;
        }else {
            nac = 1;
        }

        for(int i=nac; i<=n; i+=2){
            f*=i;
        }
        System.out.println(f);
    }
}