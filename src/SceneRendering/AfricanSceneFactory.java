package SceneRendering;

import Board.Board;
import Characters.AbstractCharacter;
import Characters.CharacterFactory.HumanFactory;
import Characters.CharacterMove.MovingDecorator;
import Houses.House;
import Houses.HouseBuilder.AfricanHouseBuilder;
import Houses.HouseBuilder.HouseBuilder;
import Houses.HouseInitializationOnMap.HouseOnMapDecorator;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class AfricanSceneFactory implements AbstractSceneFactory{

    @Override
    public void createHouses(Board board) {
        AfricanHouseBuilder africanHouseBuilder = new AfricanHouseBuilder();
        ArrayList<String> houseMaterials = new ArrayList<String>();
        Position position = new Position(1,1);
        Dimensions dimensions = new Dimensions(2,2);
        houseMaterials.add("wail");
        houseMaterials.add("cane");
        House house1 = africanHouseBuilder
                .definePositions(position)
                .defineDimensions(dimensions)
                .buildStructure(houseMaterials).getResult();
        HouseOnMapDecorator houseOnMap = new HouseOnMapDecorator(house1);
        houseOnMap.initialiseHouseOnMap(board);
        ArrayList<String> houseMaterials2 = new ArrayList<String>();
        Position position2 = new Position(0,5);
        Dimensions dimensions2 = new Dimensions(2,2);
        houseMaterials2.add("wail");
        houseMaterials2.add("cane");
        House house2 = africanHouseBuilder
                .definePositions(position2)
                .defineDimensions(dimensions2)
                .buildStructure(houseMaterials2).getResult();
        HouseOnMapDecorator houseOnMap2 = new HouseOnMapDecorator(house2);
        houseOnMap2.initialiseHouseOnMap(board);
    }

}
