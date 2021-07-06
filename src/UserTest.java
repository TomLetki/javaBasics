public class UserTest {
    public static void main(String[] args) {
        //User uzytkownik = new User();
        User uzytkownik = new User("Tomek", "tomm");
        System.out.println(uzytkownik.username);
        System.out.println(uzytkownik.password);

      /*  uzytkownik.username = "Tomek";
        uzytkownik.passwort = "haselko";*/
        uzytkownik.sayHallo();



    }
}
