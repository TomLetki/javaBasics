import java.util.Scanner;

public class InstrukcjaElseIf {
    public static void main(String[] args) {
        Scanner mojObjekt = new Scanner(System.in);
        System.out.println("Podaj liczbę :");
        int number = mojObjekt.nextInt();


        if (number>0) {
            System.out.println("Liczba większa od 0");
        }else if (number == 0) {
            System.out.println("Liczba równa 0");
        }else if (number <-10) {
            System.out.println("Liczba mniejsza od -10");
        }else {
            System.out.println("Liczba z przedziału od -10 do 0");
        }
        }
    }

