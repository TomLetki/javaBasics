import java.sql.SQLOutput;
import java.util.Scanner;

public class CustomScanner {
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();
        System.out.println("Cześć "+ name + "!");
    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę");
        int number = scanner.nextInt();
        System.out.println(" Kwadrat liczby "+ number + " wynosi " + number*number);

    }
}
