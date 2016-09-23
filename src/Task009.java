/**
 * @autor Sergeev Artem
 * 11-506
 * 009
 */
import java.util.*;

public class Task009 {

    public static void main(String[] args) {

        System.out.print("x = ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = 0;
        if (x>2){
            y = (x*x-1)/(x+2);
        }else if((x>0)&&(x<=2)){
            y = (x*x-1)*(x+2);
        }else {
            y = x*x*(1+2*x);
        }

        System.out.println("y = "+y);
    }
}
