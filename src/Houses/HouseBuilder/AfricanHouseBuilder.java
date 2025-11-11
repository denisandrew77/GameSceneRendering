package Houses.HouseBuilder;

import Houses.AfricanHouse;
import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class AfricanHouseBuilder implements HouseBuilder{

    private AfricanHouse house;

    @Override
    public House definePositions(Position position) {
        house.setPosition(position);
        return house;
    }

    @Override
    public House defineDimensions(Dimensions dimensions) {
        house.setDimensions(dimensions);
        return house;
    }

    //initially receives 2 roof types but since its a list it can receive more so its expandable
    @Override
    public House buildStructure(ArrayList<String> materials) {
        house.setMaterials(materials);
        return house;
    }


}
