import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner mojSkaner= new Scanner(System.in);
        System.out.println("Wprwdź liczbę ");
        int number = mojSkaner.nextInt();

        do {
            System.out.println("Liczba " + number + " jest mmniejsza od 50");
            number++;
        }
        while (number<50);
    }
}
