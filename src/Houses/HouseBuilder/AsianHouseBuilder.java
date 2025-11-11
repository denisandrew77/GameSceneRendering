package Houses.HouseBuilder;

import Houses.AsianHouse;
import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class AsianHouseBuilder implements SpecialRoofHouseBuilder{

    private AsianHouse house;

    public House definePositions(Position position) {
        house.setPosition(position);
        return house;
    }

    @Override
    public House defineDimensions(Dimensions dimensions) {
        house.setDimensions(dimensions);
        return house;
    }

    @Override
    public House buildStructure(ArrayList<String> materials) {
        String buildingMaterials = "";
        for(String material: materials){
            buildingMaterials = buildingMaterials.concat(material+" ");
        }
        house.setBuiltOf(buildingMaterials);
        return house;
    }

    @Override
    public House constructRoof(String roofType) {
        house.setRoofType(roofType);
        return house;
    }
}
