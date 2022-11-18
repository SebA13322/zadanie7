import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zadanie13 {
    public static void main(String[] args) throws IOException {

        File mojPlik = new File ("zadanie13.txt");


        Scanner fileScanner = new Scanner (mojPlik);


        String linia;

        linia = fileScanner.nextLine();

        System.out.println("Pierwsza linia pliku to: " + linia);


        String linia2 = fileScanner.nextLine();
        System.out.println("Druga lina pliku to: " + linia2);
        linia = fileScanner.nextLine();

        String linia3 = fileScanner.nextLine();
        System.out.println("Trzecia lina pliku to: " + linia3);
        linia = fileScanner.nextLine();

        String linia4 = fileScanner.nextLine();
        System.out.println("Czwarta lina pliku to: " + linia4);
        linia = fileScanner.nextLine();

        String linia5 = fileScanner.nextLine();
        System.out.println("Piąta lina pliku to: " + linia5);
        linia = fileScanner.nextLine();

        fileScanner.close();
    }
}