package Classes;

import Interface.iActorBehaviour;
import Interface.iReturnOrder;

public class OfferClient extends Actor implements iActorBehaviour, iReturnOrder {
    private String nameOffer;
    private int idOffer;
    private static int generalIdOffer = 1;
    private static int numbersClientOffer;

    public OfferClient(String name) {
        super(name);
        this.idOffer = generalIdOffer;
        generalIdOffer++;
    }

    public static int getNumbersClientOffer() {
        return numbersClientOffer;
    }

    public static void setNumbersClientOffer(int numbersClientOffer) {
        OfferClient.numbersClientOffer = numbersClientOffer;
    }

    public int getIdOffer() {
        return idOffer;
    }

    public String getNameOffer() {
        return nameOffer;
    }


//    public void setNameOffer(String nameOffer) {
//        this.nameOffer = nameOffer;
//    }
    public void setNameOffer(String nameOffer) {
        this.nameOffer = nameOffer;
    }

    /**
     *
     * @return
     */
    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean value) {
        this.isTakeOrder = value;
    }

    @Override
    public void setMakeOrder(boolean value) {
        this.isMakeOrder = value;
    }

    public Actor getActor() {
        return this;
    }

//    public void participateOffer(int idOffer, int numbersClientOffer) {
    public void participateOffer() {
        if (this.idOffer < numbersClientOffer + 1) {
            System.out.println(
                    "Покупатель " + super.name +
                    " с номером: " + this.idOffer +
                    " участвует в акции: " + this.nameOffer
                    );
        } else {
            System.out.println(
                    "Покупатель " + super.name +
                            " с номером: " + this.idOffer +
                            " не участвует в акции: " + this.nameOffer
            );
        }
    }

    @Override
    public void takeInQueue(iActorBehaviour actor) {

    }

    @Override
    public void releaseFromQueue() {

    }

    @Override
    public void returnOrder() {

    }
}
