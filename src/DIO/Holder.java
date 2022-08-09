package DIO;

public class Holder {
    private static class InstanceHolder {
        public static Holder instance = new Holder();
    }

    private Holder() {
        super();
    }

    public static Holder getInstance() {
        return InstanceHolder.instance;
    }
}
