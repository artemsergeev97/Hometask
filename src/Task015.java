/**
 * @autor Sergeev Artem
 * 11-506
 * 015
 */
import java.util.*;

public class Task015 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        double s = n+(x/(n+x));
        for(int i=n-1; i>0;i--){
            s = n + (x/s);
        }
        System.out.println(s);
    }
}
