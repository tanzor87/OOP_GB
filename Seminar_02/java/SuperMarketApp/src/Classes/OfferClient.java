package Classes;

import Interface.iActorBehaviour;

public class OfferClient extends Actor implements iActorBehaviour {
    private String nameOffer;
    private int id;
    static int numbersClientOffer;

    public OfferClient(String name, String nameOffer, int id) {
        super(name);
        this.nameOffer = nameOffer;
        this.id = id;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;

    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean value) {

    }

    @Override
    public void setMakeOrder(boolean value) {

    }

    @Override
    public Actor getActor() {
        return null;
    }
}
