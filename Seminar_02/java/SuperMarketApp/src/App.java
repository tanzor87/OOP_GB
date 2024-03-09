import Classes.*;
import Interface.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Ivan");
        iActorBehaviour client2 = new OrdinaryClient("Olga ");
        iActorBehaviour client3 = new SpetialClient("Basta", 1);
        iActorBehaviour client4 = new TaxInspector();

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();

    }
}
