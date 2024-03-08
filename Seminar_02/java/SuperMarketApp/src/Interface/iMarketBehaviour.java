package Interface;

import Classes.Actor;
import java.util.List;

public interface iMarketBehaviour {
    public void acceptToMarket(iActorBehaviour actor);
    public void releaseFromMarket(List<Actor> actors);
    public void update();
}
