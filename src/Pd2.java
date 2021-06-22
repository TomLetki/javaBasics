import java.util.Scanner;

public class Pd2 {
    public static void main(String[] args) {
        Scanner mojSkaner = new Scanner(System.in);
        System.out.println("Podaj wiek:");
        int wiek = mojSkaner.nextInt();

        if (wiek<18 && wiek>=0) {
            System.out.println("Nie kupisz alkoholu");
        }else if (wiek<0) {
                System.out.println("Nieprwidłowe dane");
        }else{
                System.out.println("Smacznego");
            }
    }
}





