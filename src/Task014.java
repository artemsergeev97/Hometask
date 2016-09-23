/**
 * @autor Sergeev Artem
 * 11-506
 * 014
 */
import java.util.*;

public class Task014 {

    public static void main(String[] args) {

        System.out.println("x: ");
        System.out.println("n: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble(), n = sc.nextDouble();
        double s = Math.cos(x);

        for(int i=(int)n-1; i>0;i--){
            s = Math.cos(x+s);
        }

        System.out.println(s);
    }
}
