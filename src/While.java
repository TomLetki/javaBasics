import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner mojScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int liczba = mojScanner.nextInt();

        while (liczba<100){
            System.out.println("Liczba "+ liczba+ " jest mniejsza od 100");
            liczba++;
        }
    }
}
