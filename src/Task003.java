/**
 * @autor Sergeev Artem
 * 11-506
 * 003
 */
import java.util.Scanner;



public class Task003 {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите радиус шара:");

        double R = sc.nextDouble();

        double V = (4*Math.PI*Math.pow(R, 3))/3;

        System.out.println("Объем шара = "+V);
    }

}
