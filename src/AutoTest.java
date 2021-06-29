public class AutoTest {
    public static void main(String[] args) {
            Auto mercedes =new Auto(); //typ obiektowy jak string, int itp
            mercedes.marka = "Mercedes";
            mercedes.model = "Klasa S";
            mercedes.rok = 2021;
            mercedes.przebieg = 1321;

            mercedes.jedz();
            mercedes.hamuj();
            mercedes.info();

            Auto audi = new Auto();
            audi.marka = "Audi";
            audi.model = "A8";
            audi.rok = 2020;
            audi.przebieg =0;

            audi.jedz();
            audi.hamuj();
            audi.info();

    }
}
