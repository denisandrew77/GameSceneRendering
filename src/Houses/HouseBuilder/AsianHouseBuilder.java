package Houses.HouseBuilder;

import Houses.AsianHouse;
import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class AsianHouseBuilder implements SpecialRoofHouseBuilder{

    private AsianHouse house = new AsianHouse();

    public HouseBuilder definePositions(Position position) {
        house.setPosition(position);
        return this;
    }

    @Override
    public HouseBuilder defineDimensions(Dimensions dimensions) {
        house.setDimensions(dimensions);
        return this;
    }

    @Override
    public HouseBuilder buildStructure(ArrayList<String> materials) {
        String buildingMaterials = "";
        for(String material: materials){
            buildingMaterials = buildingMaterials.concat(material+" ");
        }
        house.setBuiltOf(buildingMaterials);
        return this;
    }

    @Override
    public HouseBuilder constructRoof(String roofType) {
        house.setRoofType(roofType);
        return this;
    }

    @Override
    public House getResult() {
        return house;
    }

}
