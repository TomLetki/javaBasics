import java.util.Scanner;

public class Pd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma, roznica, iloczyn, iloraz, modulo;
        System.out.println("KALKULATOR");
        System.out.println(" Wprowadź pierwszą liczbę: ");
        int liczba1 = scanner.nextInt();
        System.out.println("Wprowadzona liczba to " + liczba1);
        System.out.println("Wprowadź drugą liczbę: ");
        int liczba2 = scanner.nextInt();
        System.out.println("Wprowadzona liczba to " + liczba2);
            suma=liczba1+liczba2;
        System.out.println("Suma wprowadzonych liczb wynosi " + suma);
            roznica=liczba1-liczba2;
        System.out.println("Różnica wprowadzonych liczb wynosi " + roznica);
            iloczyn=liczba1*liczba2;
        System.out.println("Iloczyn wprowadzonych liczb wynosi " + iloczyn);
            iloraz=liczba1/liczba2;
        System.out.println("Iloraz wprowadzonych liczb wynosi " + iloraz);
            modulo=liczba1%liczba2;
        System.out.println("Modulo wprowadzonych liczb wynosi " + modulo);
    }
}
