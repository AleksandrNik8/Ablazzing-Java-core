public class Airplane implements CanFly {
    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    private int countPassengers;

    @Override
    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Mistake: there are fewer than 0 passengers on the plane");
        } else {
            System.out.println("The plane is flying");
        }
    }
}
