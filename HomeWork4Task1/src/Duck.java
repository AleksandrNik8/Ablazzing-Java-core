public class Duck implements CanFly {
    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void setInjured(boolean injured) {
        isInjured = injured;
    }

    private boolean isInjured;

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Mistake: the duck is injured");
        } else {
            System.out.println("The duck is flying");
        }
    }
}
