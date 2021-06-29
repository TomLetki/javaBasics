public class Auto {
    public String marka;
    public String model;
    public int rok;
    public int przebieg;

    public void jedz(){
        System.out.println("Jedź! ");
    }

    public void hamuj (){
        System.out.println("Hamuję ");

    }
    public void info(){
        System.out.println("Marka " +marka);
        System.out.println("MOdel "+model);
        System.out.println("Rok produkcji "+rok);
        System.out.println("Przebieg "+przebieg);
    }

}
