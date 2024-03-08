package Classes;

import Interface.iActorBehaviour;

public class SpetialClient extends Actor implements iActorBehaviour {
    private int idVip;

    public SpetialClient(String name, int idVip) {
        super(name);
        this.idVip = idVip;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public void setMakeOrder(boolean value) {
        super.isMakeOrder = value;
    }

    public void setTakeOrder(boolean value) {
        super.isTakeOrder = value;
    }

    public Actor getActor() {
        return this;
    }
}
