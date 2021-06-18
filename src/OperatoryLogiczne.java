public class OperatoryLogiczne {
    public static void main(String[] args) {
        boolean firstValue = 2 > 1; //true
        boolean seconValue = 1 > 2; //false
        boolean thirdValue = false;
        boolean fourthValue = true;

        // &&   i true gdy wyrazenia składowe są true
        System.out.println(firstValue && seconValue); //false
        System.out.println(firstValue && fourthValue); //true
        System.out.println(seconValue && thirdValue); //false

        //   ||  lub   true gdy jedno lub oba wyrażnie składowe jest true

        System.out.println(firstValue || seconValue); //true
        System.out.println(firstValue || fourthValue); //true
        System.out.println(seconValue || thirdValue); // false

        //  !  negacja, zwraca wartość do wyrażenia wyrażenia przed którym się znajduje
        System.out.println(!firstValue); //false
        System.out.println(!thirdValue); // true
        System.out.println(!(firstValue&&seconValue)); //true

    }
}
