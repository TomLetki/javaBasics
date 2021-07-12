public class PersonTest {
    public static void main(String[] args) {
        Teacher nauczyciel = new Teacher("Adam", 31, "Liceum a nie zerówka");
        //nauczyciel.name="Adam";
        //nauczyciel.age=30;
        //nauczyciel.school="zerówka";
       nauczyciel.walk();
        nauczyciel.eat();
        //nauczyciel.sayHello();
       // nauczyciel.teachMath();

        Footballer pilkarz = new Footballer("Michaił", 55, "DVD");
        pilkarz.name="Michał";
        pilkarz.age=22;
        pilkarz.club="Podgrodzianka";
        pilkarz.walk();
        pilkarz.eat();
        pilkarz.playFootball();
    }
}
