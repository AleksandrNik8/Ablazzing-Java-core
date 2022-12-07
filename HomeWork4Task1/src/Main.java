
public class Main {
    public static void main(String[] args) throws FlyException {
        Duck duck = new Duck(false);
        Duck duck1 = new Duck(true);
        Airplane airplane = new Airplane(10);
        Airplane airplane1 = new Airplane(-1);
        Object[] obj = new Object[]{duck, duck1, airplane, airplane1};

        for (Object o : obj) {
            if (o instanceof Duck duck2) {
                try {
                    duck2.fly();
                } catch (FlyException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                Airplane airplane2 = (Airplane) o;
                try {
                    airplane2.fly();
                } catch (FlyException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}