import java.util.Scanner;
public class zadanie9 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double suma;
        int populacja2;
        int populacja1;
        int populacja;

        System.out.println("Podaj liczbę populacji: ");
        populacja = klawiatura.nextInt();
        klawiatura.nextLine();


        int przyrost;

        System.out.println("Średni przyrost populacji w procentach: ");
        przyrost = klawiatura.nextInt();
        klawiatura.nextLine();


        int dni;

        System.out.println("liczba dni : ");
        dni = klawiatura.nextInt();
        klawiatura.nextLine();



        for(int i = 0; i <dni; i++)
        {
            populacja1=(przyrost*populacja/100)+populacja;
            System.out.println("Podczas "+ i +" dnia będzie " + populacja1 + " osobników");
            populacja = populacja1;
        }

    }
}