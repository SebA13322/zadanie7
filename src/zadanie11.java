import java.util.Scanner;
public class zadanie11 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

     double celsjusza;
     double fahenheita;

     for(double i=0; i <20; i++)
     {
         celsjusza = i;
         fahenheita = 1.8*celsjusza+32;
         System.out.println("Stopnie celsjusza: " + i + "    Stopnie Fahrenheita: " + fahenheita);

     }


    }
}