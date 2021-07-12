public class AppChecker
{
    public static void main(String[] args) {
    AndroidApp android = new AndroidApp("Kalkulator");
    android.appInfo();
    android.runAndroidApp();

    IphoneApp ios = new IphoneApp("I-kalkluator");
    ios.appInfo();
    ios.runIphoneApp();

    }




}
