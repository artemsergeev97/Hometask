/**
 * @autor Sergeev Artem
 * 11-506
 * 031
 */import java.util.Scanner;

public class Task031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]  = new int [n];
        int s = 0, p = 1;
        for(int i=0; i<n; i++){
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
            System.out.println();
        }
        int w = 0;
        for(int i=2; i<n; i+=3){
            if(a[i]%3==0) w++;
        }

        if(w==(n/3)){
            for(int i=0;i<n;i++){
                if(a[i]>0){
                    s+=a[i];
                }
            }
            System.out.println("s = "+s);
        }else {
            for(int i=0;i<n;i++){
                if(a[i]>0) p*=a[i];
            }
            System.out.println("p = "+p);
        }
    }
}
