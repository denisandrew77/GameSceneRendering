package Houses.HouseBuilder;

import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public interface HouseBuilder {
    HouseBuilder definePositions(Position position);
    HouseBuilder defineDimensions(Dimensions dimensions);
    HouseBuilder buildStructure(ArrayList<String> materials);
    House getResult();
}

