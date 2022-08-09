package DIO;

public class Preguiçoso {
    private static Preguiçoso instance;

    private Preguiçoso() {
        super();
    }

    public static Preguiçoso getInstance() {
        if (instance == null) {
            instance = new Preguiçoso();
        }
        return instance;
    }
}
