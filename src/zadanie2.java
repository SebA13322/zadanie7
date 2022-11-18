import java.util.Scanner;
public class zadanie2 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);


        int predkosc=0;
        int czas;
        int suma;


        System.out.println("podaj prędkosc samochodu: ");
        predkosc = klawiatura.nextInt();
        klawiatura.nextLine();

        System.out.println("podaj liczbe godzin podróży: ");
        czas = klawiatura.nextInt();
        klawiatura.nextLine();

        for(int i = 1; i <=czas; i++)
        {
            suma = predkosc*i;
            System.out.println("podczas "+i+" godziny przejedziesz "+ suma + "kilometrów");

        }

    }
}