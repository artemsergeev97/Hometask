/**
 * @autor Sergeev Artem
 * 11-506
 * 028
 */import java.util.Scanner;

public class Task028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), m = sc.nextInt();

        for (int i=k;i<=m;i++){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
