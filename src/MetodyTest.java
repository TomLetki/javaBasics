import java.io.OutputStream;

public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
       /* metody.policzWynik();
        int result = metody.pobierzWynik();
        int result2 = result*2;
        System.out.println("reultat po mnożeniu "+result2);*/

        //metody.policzWynikParam(2);
        //metody.policzWynikParam(100);
        //metody.policzWynikParam(23);

        //metody.add(2,3, "Hallo");
        //System.out.println(metody.add(2, 3, "hallo2 "));

        int result = metody.add(2,3, "przykladowy_napis");
        System.out.println(metody.add(2,6, "przykladowy_napis2"));


    }
}
