public class Car {
    public Car(int cost) {
        this.cost = cost;
    }

    public Car() {
    }

    public int getCost() throws SellException {
        if (cost < 0) {
            throw new SellException("Unknown to me.");
        } else {
            return cost;
        }
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    private int cost;

}
