package DIO;

public class Apressado {
    private static final Apressado instance = new Apressado();

    private Apressado() {
        super();
    }

    public static Apressado getInstance() {
        return instance;
    }
}
