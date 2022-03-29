package lambda;

public class ItStudent implements Student{


    @Override
    public void sayHello(String name, int age) {
        System.out.println("Jestem studentem IT");
        System.out.println("Nazywam się "+ name + "mój wiek to "+ age);
    }
}

