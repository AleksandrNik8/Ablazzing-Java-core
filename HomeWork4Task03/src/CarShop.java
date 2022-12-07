// Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимостью 5000
// Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
// 5000 - (вызванно из объекта Car)
// Хочешь купить авто? (Вызвано из объекта CarShop)


public class CarShop extends Car {
    private Car car;

    public CarShop(Car car) {
        super();
        this.car = car;
    }


    public void sellCar() {
        System.out.println("Hello customer, the price of this car");
        try {
            System.out.println(car.getCost());
            System.out.println("Do you want to buy a car?");
        } catch (SellException e) {
            System.out.println(e.getMessage() + "\n" + "Let's see another car?");
        }
    }
}
