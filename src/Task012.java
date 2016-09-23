/**
 * @autor Sergeev Artem
 * 11-506
 * 012
 */
import java.util.*;

public class Task012 {

    public static void main(String[] args) {

        System.out.println("n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 3;
        double s = 1;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                s-=1/(c*c);
            }else {
                s+=1/(c*c);
            }
            c+=2;
        }

        System.out.println(s);
    }
}
