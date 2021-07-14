package Drivers;

public class DrvSchk {
    public static void main(String[] args) {
        WebDriver driver = getDriver("firefox");
        driver.get();
        driver.findElementBy();


       // FirefoxDriver firefox = new FirefoxDriver();
       // firefox.get();
       // firefox.findElementBy();
            }

    private static WebDriver getDriver(String name) {
        if(name.equals("chrome")) {
            return new ChromeDriver();
        }else if(name.equals("firefox")){
            return new FirefoxDriver();
        }
        return null;
    }
}
