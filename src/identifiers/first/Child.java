package identifiers.first;
//klasa potomna w tej samej paczce nie ma dostepu do pól prywatnych klasy nadrzędnej
public class Child extends Parent {
    public void testIdentifier(){
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        //System.out.println(fourth);
        firstMethod();
        secondMethod();
        thirdMethod();
        //fourthMethod();
    }
}
