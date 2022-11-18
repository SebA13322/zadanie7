import java.util.Scanner;
public class zadanie8 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);



        int lata;
        int styczen;
        int luty;
        int marzec;
        int kwiecien;
        int maj;
        int czerwiec;
        int lipiec;
        int sierpien;
        int wrzesien;
        int pazdziernik;
        int listopad;
        int grodzien;

        System.out.println("podaj liczbe lat: ");
        lata = klawiatura.nextInt();
        klawiatura.nextLine();



        for(int i = 0; i <lata; i++)
        {
            System.out.println("podaj srednią opadów w styczniu : ");
            styczen = klawiatura.nextInt();
            klawiatura.nextLine();

        }

    }
}