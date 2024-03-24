package Fabric;

import Interface.iGameIthem;
import Product.GemReward;
import Product.GoldReward;

public class GemGenerator extends ItemGenerator{

    @Override
    public iGameIthem createItem() {
        return new GemReward();
    }
}
