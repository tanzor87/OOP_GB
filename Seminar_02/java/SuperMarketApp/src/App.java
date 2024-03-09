import Classes.*;
import Interface.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Ivan");
        iActorBehaviour client2 = new OrdinaryClient("Olga ");
        iActorBehaviour client3 = new SpetialClient("Basta", 1);
        iActorBehaviour client4 = new TaxInspector();

        OfferClient client5 = new OfferClient("Max");
        OfferClient client6 = new OfferClient("Dima");
        OfferClient client7 = new OfferClient("Viktor");
        OfferClient client8 = new OfferClient("Maria");
        OfferClient client9 = new OfferClient("Sergey");
        OfferClient client10 = new OfferClient("Nina");

        OfferClient.setNumbersClientOffer(5);
        client5.setNameOffer("Скидка 15% на все!");
        client5.participateOffer();
        client6.setNameOffer("Скидка 15% на все!");
        client6.participateOffer();
        client7.setNameOffer("Скидка 15% на все!");
        client7.participateOffer();
        client8.setNameOffer("Скидка 15% на все!");
        client8.participateOffer();
        client9.setNameOffer("Скидка 15% на все!");
        client9.participateOffer();
        client10.setNameOffer("Скидка 15% на все!");
        client10.participateOffer();

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
//        client5.setNameOffer(

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.acceptToMarket(client6);
        magnit.acceptToMarket(client7);
        magnit.acceptToMarket(client8);
        magnit.acceptToMarket(client9);
        magnit.acceptToMarket(client10);

        magnit.update();

    }
}
