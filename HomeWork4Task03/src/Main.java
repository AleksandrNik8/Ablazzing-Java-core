
public class Main {
    public static void main(String[] args) {
        CarShop carShop1 = new CarShop(new Car(5000));
        carShop1.sellCar();
        CarShop carShop2 = new CarShop(new Car(-20));
        carShop2.sellCar();
    }
}