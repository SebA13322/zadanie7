import java.util.Scanner;
public class zadanie12 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        double sklep1;
        double sklep2;
        double sklep3;
        double sklep4;
        double sklep5;
        System.out.println("Podaj ile zarobił sklep nr 1: ");
        sklep1 = klawiatura.nextInt();
        klawiatura.nextLine();
        sklep1 = sklep1/100;

        System.out.println("Podaj ile zarobił sklep nr 2: ");
        sklep2 = klawiatura.nextInt();
        klawiatura.nextLine();
        sklep2 = sklep2/100;

        System.out.println("Podaj ile zarobił sklep nr 3: ");
        sklep3 = klawiatura.nextInt();
        klawiatura.nextLine();
        sklep3 = sklep3/100;

        System.out.println("Podaj ile zarobił sklep nr 4: ");
        sklep4 = klawiatura.nextInt();
        klawiatura.nextLine();
        sklep4 = sklep4/100;

        System.out.println("Podaj ile zarobił sklep nr 5: ");
        sklep5 = klawiatura.nextInt();
        klawiatura.nextLine();
        sklep5 = sklep5/100;

        System.out.print("Sklep nr1: ");
        for(int i = 0; i < sklep1; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("Sklep nr2: ");
        for(int i = 0; i < sklep2; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("Sklep nr3: ");
        for(int i = 0; i < sklep3; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("Sklep nr4: ");
        for(int i = 0; i < sklep4; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.print("Sklep nr5: ");
        for(int i = 0; i < sklep5; i++)
        {
            System.out.print("*");
        }
        System.out.print("\n");
    }
}