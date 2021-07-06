public class User {
    public String username;
    public String password;

    public User(){}
    public User(String username, String password){
        this.username = username;
        this.password = password;
        System.out.println("Tekst  metody konstruktora");
    }

    public void sayHallo(){
        System.out.println("Hello, my name is :"+username);
    }
}
