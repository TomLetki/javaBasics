public class Footballer extends Person {

    public String club;

    public Footballer(String name, int age, String club) {
        super(name, age, club);
        this.club=club;
        System.out.println("Jesten w konstr Footballer");
    }
    public void eat(){
        System.out.println("Lubię zdrowe jedzenie");
    }

    public void playFootball(){

        System.out.println("Gram w piłkę");
        System.out.println("Mój klub to "+club);
    }

}
