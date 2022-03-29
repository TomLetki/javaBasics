package lambda;

public class StudentTest {
    public static void main(String[] args) {
Student it = new ItStudent();
sayHallo("Janek ", 21, it);

Student med = new Student() {
    @Override
    public void sayHello(String name, int age) {
        System.out.println("Będę lekarzem ");
        System.out.println("Nazywam się "+name);
    }
};
sayHallo("Kasia", 21, med);

Student noStudent = (name, age) ->
        System.out.println("NIe jestem studentem, nazywam się " + name);
        sayHallo("Adam", 21, noStudent);


        Student pol = (name, age) ->
                System.out.println("Jestem polonistą "+ name + age);
        sayHallo("Pipsztyk", 27, pol);

    }
    public static void sayHallo(String name, int age, Student student){
        student.sayHello(name, age);
    }
}
