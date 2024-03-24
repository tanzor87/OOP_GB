package Fabric;

import Interface.iGameIthem;
import Product.GoldReward;

public class GoldGenerator extends ItemGenerator {

    @Override
    public iGameIthem createItem() {
        return new GoldReward();
    }
}
