package identifiers.first;

public class Random {
//klasa w tej samej paczce nie ma dpstępu do pól i metod private.
    public void identifiers(){
        Parent rodzic = new Parent();

        System.out.println(rodzic.first);
        System.out.println(rodzic.second);
        System.out.println(rodzic.third);
       // System.out.println(rodzic.fourth); - brak dostępu
        rodzic.firstMethod();
        rodzic.secondMethod();
        rodzic.thirdMethod();
        //rodzic.fourthMethod();
    }
}
