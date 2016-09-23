/**
 * @autor Sergeev Artem
 * 11-506
 * 034
 */import java.util.Arrays;
import java.util.Scanner;

public class Task034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
            System.out.println();
        }
        int b [] = new int [n-2];
        for(int i=2;i<n;i++){
            b[i-2] = a[i]+a[i-1]+a[i-2];
        }

        Arrays.sort(b);

        System.out.println(b[n-3]);
    }
}
