import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner mojSkaner = new Scanner(System.in);
        System.out.println("Wybierz danie: Pizza, Losos, Zupa, Frytki");

        String danie = mojSkaner.next();

        switch (danie){
            case "Pizza":
                System.out.println("Cena 22 PLN");
                break;
            case "Losos":
                System.out.println("Cena 35 PLN");
                break;
            case "Zupa":
                System.out.println("Cena 11 PLN");
                break;
            case "Frytki":
                System.out.println("Cena 9 PLN");
                break;
            default:
                System.out.println("Brak dania w karcie");

        }

    }
}
