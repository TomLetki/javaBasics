public class Truck implements Vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jadęciężarówkąz prędkością "+speed);
    }

    @Override
    public void stop() {
        System.out.println("hamowanie cieżarówki ");

    }

    @Override
    public String info() {
        return "ciężarówka";
    }
}
