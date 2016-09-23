/**
 * @autor Sergeev Artem
 * 11-506
 * 020
 */
public class Task020 {

    public static void main(String[] args) {
        /*2n+1
        */
        int n = 5;
        int x = 2*n+1;
        int y = 2*n+1;

        for(int i = 0; i < x; i++) {

            for(int j = 0; j < y; j++) {

                if(j==y/2-i||j==y/2+i||j==i-y/2||j==x-i+x/2-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
