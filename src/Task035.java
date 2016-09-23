/**
 * @autor Sergeev Artem
 * 11-506
 * 035
 */import java.util.Scanner;

public class Task035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
            System.out.println();
        }

        for(int i = a.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( a[j] > a[j+1] ){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }

        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
