import java.util.Scanner;

public class PetlaFor {
    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = mojScanner.nextInt();
        int i;
        for (i = 0; i <= liczba; i = i + 2) {
            System.out.println(i);
        }

        for (i = 0; i <= liczba; i++) {
            if (i % 5 == 0) {                   //podzielne przez 5
                System.out.println(i);
            }
        }
    }
}



