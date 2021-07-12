public class Teacher extends Person {

    public String school;
    public void teachMath(){

        System.out.println("Uczę matematyki");
    }
    public void walk(){
        System.out.println("Lubię biegać a nie spacerować");
    }
    public Teacher(String name, int age, String school){
        super(name, age, school);
        this.school = school;
        System.out.println("jestem w konstr nauczycielskim");
    }
    public void sayHello(){
        System.out.println("Hallo, my name is "+name);
        System.out.println("My age is " +age);
        System.out.println("Moja szkoła to"+school);
    }

}
