public class Auto {
    public String marka;
    public String model;
    public Integer rok;
    public Integer przebieg;

    public Auto(String marka, String model, int rok, int przebieg){
        this.marka=marka;
        this.model=model;
        this.rok=rok;
        this.przebieg=przebieg;
    }
    public void info(){
        System.out.println("-----------------------");
        System.out.println(marka);
        System.out.println(model);
        System.out.println(rok);
        System.out.println(przebieg);

    }
}
