// работник (обладает часами - (часы одни))
public class Employee {
    public Employee(Watch watch) {
        this.watch = watch;
    }

    public Watch getWatch() {
        return watch;
    }

    public void setWatch(Watch watch) {
        this.watch = watch;
    }

    private Watch watch;
}
