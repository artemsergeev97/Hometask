/**
 * @autor Sergeev Artem
 * 11-506
 * 004
 */
public class Task004 {

    public static void main(String[]args){

        double x=2.0,y=5.0;
        double result = 0;

        result = (1+y) * (2*x+y*y-(x+y)/(y+1/(x*x-4)));

        System.out.println("result : "+result);
    }

}