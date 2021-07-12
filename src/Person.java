public class Person {

    public String name;
    public int age;

    public Person(String name, int age, String club){
        System.out.println("Konstruktor w person");
        this.name = name;
        this.age = age;
    }


    public void eat(){
        System.out.println("lubię jeść pizzę");
    }
    public void walk(){
        System.out.println("lubię spacerować");
    }
}
