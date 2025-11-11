package Houses.HouseBuilder;

import Houses.EuropeanHouse;
import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class EuropeanHouseBuilder implements HouseBuilder{

    private EuropeanHouse house;

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

    @Override
    public House buildStructure(ArrayList<String> buildingMaterials) {
        String currentMaterial = "";
        for(int i=0;i< buildingMaterials.size();i++){
            currentMaterial = currentMaterial.concat(buildingMaterials.get(i)+" ");
        }
        house.setBuiltOf(currentMaterial);
        return house;
    }
    
}
