package Houses.HouseBuilder;

import Houses.AfricanHouse;
import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class AfricanHouseBuilder implements HouseBuilder{

    private AfricanHouse house = new AfricanHouse();

    @Override
    public HouseBuilder definePositions(Position position) {
        house.setPosition(position);
        return this;
    }

    @Override
    public HouseBuilder defineDimensions(Dimensions dimensions) {
        house.setDimensions(dimensions);
        return this;
    }

    //initially receives 2 roof types but since its a list it can receive more so its expandable
    @Override
    public HouseBuilder buildStructure(ArrayList<String> materials) {
        house.setMaterials(materials);
        return this;
    }

    @Override
    public House getResult() {
        return house;
    }

}
