package identifiers.second;

import identifiers.first.Parent;

public class Random {

    //klasa w innej samej paczce nie ma dpstępu do pól i metod private, defult, protected.
    public void identifiers() {
        Parent rodzic = new Parent();

        System.out.println(rodzic.first);
        //System.out.println(rodzic.second);
        //System.out.println(rodzic.third);
        //System.out.println(rodzic.fourth);
        rodzic.firstMethod();
        //rodzic.secondMethod();
        //rodzic.thirdMethod();
        //rodzic.fourthMethod();
    }
}
