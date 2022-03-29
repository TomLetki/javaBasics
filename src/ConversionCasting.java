import Drivers.FirefoxDriver;
import Drivers.WebDriver;

public class ConversionCasting {
    public static void main(String[] args) {
        int a=8;
        double b=4.23;

        double c=a/b; //int zostaje przekonwertowany na double
        int d = a/(int)b; //przekonwertowanie double na int. Bez miejsc po przecinku

        System.out.println(c);
        System.out.println(d);

        WebDriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;//konwersja wbdriver na firefoxdriver
        firefoxDriver.get();

    }
}
