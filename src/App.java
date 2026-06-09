import java.util.LinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkList();

        
    }

    private static void runLinkList() {
        LinkedList<String> nombres = new LinkedList<>();

        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
        nombres.add("Mateo");

        String primero = nombres.getFirst();
        System.out.println(primero);

        System.out.println(nombres.get(5));

    }
}
