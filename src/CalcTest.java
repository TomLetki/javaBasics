public class CalcTest {

    public static void main(String[] args) {
        Calc kalkulator = new Calc();
        int nu1=6, nu2=4;

        System.out.println(kalkulator.dodawanie(nu1,nu2));
        System.out.println(kalkulator.odejmowanie(nu1,nu2));
        System.out.println(kalkulator.mnozenie(nu1,nu2));
        System.out.println(kalkulator.dzielenie(nu1,nu2));
        System.out.println(kalkulator.modul(nu1,nu2));

    }
}
