package Houses.HouseBuilder;

import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

interface HouseBuilder {
    House definePositions(Position position);
    House defineDimensions(Dimensions dimensions);
    House buildStructure(ArrayList<String> materials);
}

