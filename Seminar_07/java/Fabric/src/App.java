import Fabric.GemGenerator;
import Fabric.GoldGenerator;
import Fabric.ItemGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) {
        ItemGenerator f1 = new GoldGenerator();
        f1.openReward();

        ItemGenerator f2 = new GemGenerator();
        f2.openReward();

        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());

        Random random = ThreadLocalRandom.current();

        for (int i = 0; i<10; i++) {
            int index = random.nextInt(10);
            generatorList.get(index).openReward();
        }
    }
}
