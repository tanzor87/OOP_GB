package Classes;

import Interface.iActorBehaviour;

public class TaxInspector implements iActorBehaviour {
    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;
    public TaxInspector(){
        this.name = "Tax inspector";
    }

    public String getName()
    {
        return name;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setTakeOrder(boolean value) {
        isTakeOrder = value;
    }

    public void setMakeOrder(boolean value) {
        isMakeOrder = value;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }
}
