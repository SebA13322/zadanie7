import java.util.Scanner;
public class zadanie1 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        int liczba=0;
        int i;
        int liczba1=0;
        int liczba2=0;

        System.out.println("Podaj liczbę dodatną ciałkowitą niezerową: ");
        liczba = klawiatura.nextInt();
        klawiatura.nextLine();

        for(i=1; i<liczba; i++)
        {

            liczba2=liczba1;
            liczba1 = liczba2+i;

                    }
        System.out.println("Suma wynosi: "+liczba1);
    }
}