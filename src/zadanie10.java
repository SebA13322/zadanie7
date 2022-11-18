import java.util.Scanner;
public class zadanie10 {
    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        int liczby=0;
        int min =  0 , max = 0;

       while(liczby!= -99 )
        {
        System.out.println("Podaj liczbe: ");
        liczby = klawiatura.nextInt();

        if(liczby > max && liczby != -99 )
        {
            max = liczby;
        }
        if(liczby < min && liczby != -99 )
        {
            min = liczby;
        }




        }
        System.out.println("Najmniejsza liczba wynosi: " +  min);
        System.out.println("Największa liczba wynosi: " +  max);
    }
}