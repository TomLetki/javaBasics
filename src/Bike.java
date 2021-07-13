public class Bike implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadę z prędkością "+speed);
    }

    @Override
    public void stop() {
        System.out.println("hamuję ");
    }

    @Override
    public String info() {
        return "rower";
    }
    public void zatankuj(){
        System.out.println("aby mieć siłę muszę zjeść pączka");
    }
}
