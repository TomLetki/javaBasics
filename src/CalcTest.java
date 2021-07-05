import java.util.Scanner;

public class CalcTest {

    public static void main(String[] args) {
        Scanner wczytaj = new Scanner(System.in);
        Calc kalkulator = new Calc();
        System.out.println(" Wprowadź pierwszą liczbę ");
        int nu1 = wczytaj.nextInt();
        System.out.println(" Wprowadź pierwszą liczbę ");
        int nu2 = wczytaj.nextInt();

        System.out.println(kalkulator.dodawanie(nu1,nu2));
        System.out.println(kalkulator.odejmowanie(nu1,nu2));
        System.out.println(kalkulator.mnozenie(nu1,nu2));
        System.out.println(kalkulator.dzielenie(nu1,nu2));
        System.out.println(kalkulator.modul(nu1,nu2));

    }
}
