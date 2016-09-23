/**
 * @autor Sergeev Artem
 * 11-506
 * 016
 */
import java.util.Scanner;

public class Task016 {

    public static void main(String[] args) {

        System.out.println("n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();
        int w = 1;
        double s = 0, p = 1;

        for (int i=1; i<=n; i++){
            p*=(x+i);
            s+=p;
        }

        System.out.println(s);
    }
}
