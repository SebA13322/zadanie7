import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class zadanie6 {
    public static void main(String[] args)throws IOException  {
        Scanner klawiatura = new Scanner(System.in);

        PrintWriter pw = new PrintWriter("zad6.txt");
        String name;

        String litera;

        int c=0;

        System.out.println("podaj słowo: ");
        name = klawiatura.nextLine();


        System.out.println("podaj litere: ");
        litera = klawiatura.nextLine();



        for(int i = 1; i <=czas; i++)
        {



            suma = predkosc*i;
            pw.println("podczas " +i+  " godziny przejedziesz "+ suma + " kilometrow");



        }
        pw.close();
    }
}