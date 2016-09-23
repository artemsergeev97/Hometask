/**
 * @autor Sergeev Artem
 * 11-506
 * 036
 */import java.util.Scanner;

public class Task036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
            System.out.println();
        }
        int w=0;
        for (int i=1;i<n;i++){
            w = 0;
            for (int j=0; j<i; j++) {
                if (a[i] > a[j]) w++;
            }
            if (w==i){
                System.out.println(a[i]);
            }
        }
    }
}
