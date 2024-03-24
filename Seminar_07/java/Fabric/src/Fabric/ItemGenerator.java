package Fabric;

import Interface.iGameIthem;

public abstract class ItemGenerator {
    public void openReward(){
        iGameIthem gameIthem = createItem();
        gameIthem.open();

    }
    public abstract iGameIthem createItem();
}
