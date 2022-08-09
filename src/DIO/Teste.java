package DIO;

public class Teste {

        public static void main(String[] args) {


            Preguiçoso lazy = Preguiçoso.getInstance();
            System.out.println(lazy);
            lazy = Preguiçoso.getInstance();
            System.out.println(lazy);

            Apressado eager = Apressado.getInstance();
            System.out.println(eager);
            eager = Apressado.getInstance();
            System.out.println(eager);

            Holder lazyHolder = Holder.getInstance();
            System.out.println(lazyHolder);
            lazyHolder = Holder.getInstance();
            System.out.println(lazyHolder);
}
    }