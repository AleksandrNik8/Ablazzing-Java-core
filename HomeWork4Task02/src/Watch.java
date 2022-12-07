//часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
public class Watch implements CanTick {
    public Watch(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    private boolean isBroken;

    @Override
    public void canTick() throws WatchBrokenError {
        if (isBroken) {
            throw new WatchBrokenError("Error: The watch is broken.");
        } else {
            System.out.println("The clock is ticking");
        }
    }
}
