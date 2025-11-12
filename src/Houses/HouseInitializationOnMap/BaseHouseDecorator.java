package Houses.HouseInitializationOnMap;

import Board.Board;
import Houses.House;

public abstract class BaseHouseDecorator {
    private House wrappee;

    public BaseHouseDecorator(House wrappee) {
        this.wrappee = wrappee;
    }

    public House getWrappee() {
        return wrappee;
    }

    public abstract void initialiseHouseOnMap(Board board);
}
