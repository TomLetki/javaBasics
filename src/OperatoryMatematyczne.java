//Oparatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber =4;
        int secondNumber =6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; // 10
        int substraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber / secondNumber; // 0,6666
        int mod = secondNumber % firstNumber; // reszta z dzielenia. 1 resty 2

        System.out.println("Wynik dodawania "+ addition);
        System.out.println("Wynik odejmowania "+ substraction);
        System.out.println("Wynik mnożenia "+ multiplication);
        System.out.println("Wynik dzielenia "+ division);
        System.out.println("Wynik Modulo "+ mod);

        firstNumber+=secondNumber; // firstNumber=firstNumber+secondNumber
        System.out.println("Po dodaniu "+ firstNumber);
        firstNumber-=secondNumber;
        System.out.println("Po odejmowaniu "+ firstNumber);
        firstNumber*=secondNumber;
        System.out.println("Po mnożeniu "+firstNumber);
        firstNumber/=secondNumber;
        System.out.println("Po dzieleniu "+firstNumber);
        firstNumber%=secondNumber;
        System.out.println("Po modulo " +firstNumber);





    }
}
