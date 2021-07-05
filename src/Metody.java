public class Metody {

    public int pobierzWynik(){
        System.out.println("WYnik dodwania ");
        int result =0;
        for (int i=0; i<100; i++){
            result=result+i;
        }
        System.out.println("Wynik to "+result);
        return result;
    }
    public void policzWynikParam(int number) {
        System.out.println("Wprowadzony number wynosi : "+number);
        System.out.println("WYnik dodwania ");
        int result = 0;
        for (int i = 0; i < number; i++) {
            result = result + i;
        }
        System.out.println("Wynik to " + result);
    }


    public int add(int firstNumber, int secondNumber, String word) {

        System.out.println("Suma to " +(firstNumber+secondNumber));
        System.out.println(word);
        if(firstNumber==0) {
            return 0;
        }
        return firstNumber+secondNumber;
    }
}


