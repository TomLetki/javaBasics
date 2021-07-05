public class Calc {

    /*public int dodawanie(int firstNumber, int secondNumber){
        System.out.println("Wynik dodawania to "+(firstNumber+secondNumber));
        return 0;
    }

    public int odejmowanie(int firstNumber, int secondNumber){
        System.out.println("Wynik odejmowania to "+(firstNumber-secondNumber));
        return 0;
    }

    public int mnozenie(int firstNumber, int secondNumber){
        System.out.println("Wynik mnożenia to "+(firstNumber*secondNumber));
        return 0;
    }

    public int dzielenie(int firstNumber, int secondNumber) {
        if (secondNumber != 0) {
            System.out.println("Wynik dzielenia to " + (firstNumber / secondNumber));

        } else {
            System.out.println("Błąd, dzielnie przez zero");
        }return 0;
    }

    public int modul(int firstNumber, int secondNumber){
        System.out.println("Wynik modulo to "+(firstNumber%secondNumber));
        return 0;
    }*/

    public int dodawanie(int firstNumber, int secondNumber){
        System.out.println("Wynik dodawania to ");

        return firstNumber+secondNumber;
    }

    public int odejmowanie(int firstNumber, int secondNumber){
        System.out.println("Wynik odejmowania to ");
        return firstNumber-secondNumber;
    }

    public int mnozenie(int firstNumber, int secondNumber){
        System.out.println("Wynik mnożenia to ");
        return firstNumber*secondNumber;
    }

    public int dzielenie(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Błąd, dzielnie przez zero");
            return 0;
        } else {
            System.out.println("Wynik dzielenia to " );
        }return firstNumber/secondNumber;
    }

    public int modul(int firstNumber, int secondNumber){
        System.out.println("reszty ");
        return firstNumber%secondNumber;
    }

}
