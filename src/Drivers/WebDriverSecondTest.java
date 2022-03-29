package Drivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {


        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver secondFirefox = new FirefoxDriver();
        WebDriver thirdFirfox = new FirefoxDriver();

        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Opening page with safari");
            }


            @Override
            public void findElementBy() {
                System.out.println("finding element with safari");
            }
        };
        safari.get();
        safari.findElementBy();
    }
}
