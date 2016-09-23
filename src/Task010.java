/**
 * @autor Sergeev Artem
 * 11-506
 * 010
 */
import java.util.*;

public class Task010 {

    public static void main(String[] args) {
        System.out.println("x: ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double y = (x>2) ? (x*x-1)/(x+2) : (x*x-1)*(x+2);
        y = ((x>0)&&(x<=2)) ? (x*x-1)*(x+2) : (x*x)*(1+2*x);

        System.out.println(y);

    }
}
