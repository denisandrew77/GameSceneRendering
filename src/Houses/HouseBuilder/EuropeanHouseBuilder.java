package Houses.HouseBuilder;

import Houses.EuropeanHouse;
import Houses.House;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class EuropeanHouseBuilder implements HouseBuilder{

    private EuropeanHouse house = new EuropeanHouse();

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

    @Override
    public HouseBuilder buildStructure(ArrayList<String> buildingMaterials) {
        String currentMaterial = "";
        for(int i=0;i< buildingMaterials.size();i++){
            currentMaterial = currentMaterial.concat(buildingMaterials.get(i)+" ");
        }
        house.setBuiltOf(currentMaterial);
        return this;
    }

    @Override
    public House getResult() {
        return house;
    }

}
