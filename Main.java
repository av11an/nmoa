import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] arsgs){

        //get variables

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Root number: ");
            float rootNum = (float) Integer.parseInt(input.nextLine());

            System.out.println("Inside number: ");
            float insideNum = (float) Integer.parseInt(input.nextLine());


            //calculate aprox until true

            float aprox = 0;
            float n = 1;
            float compareAprox = 0;
            
            while(n != compareAprox){
                compareAprox = aprox;
                float dx = (float) (Math.pow(n, rootNum) - insideNum);
                float dxd = (float) (Math.pow(n, rootNum - 1) * rootNum);
                aprox = (float) (n - (dx/dxd));
                n = aprox;
                System.out.println(aprox);
            }

            System.out.println("NMOA: " + n);

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

    }
}