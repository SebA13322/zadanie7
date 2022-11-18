import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class zadanie3 {
    public static void main(String[] args)throws IOException  {
        Scanner klawiatura = new Scanner(System.in);


        int predkosc=0;
        int czas;
        int suma;

        PrintWriter pw = new PrintWriter("kilometry.txt");
        System.out.println("podaj prędkosc samochodu: ");
        predkosc = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("podaj liczbe godzin podróży: ");
        czas = klawiatura.nextInt();
        klawiatura.nextLine();

        for(int i = 1; i <=czas; i++)
        {



            suma = predkosc*i;
            pw.println("podczas " +i+  " godziny przejedziesz "+ suma + " kilometrow");



        }
        pw.close();
    }
}