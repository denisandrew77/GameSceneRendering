package SceneRendering;

import Board.Board;
import Characters.AbstractCharacter;
import Characters.CharacterFactory.HumanFactory;
import Characters.CharacterMove.MovingDecorator;
import Houses.AsianHouse;
import Houses.House;
import Houses.HouseBuilder.AsianHouseBuilder;
import Houses.HouseBuilder.HouseBuilder;
import Houses.HouseInitializationOnMap.HouseOnMapDecorator;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class AsianSceneFactory implements AbstractSceneFactory{

    @Override
    public void createHouses(Board board) {
        AsianHouseBuilder asianHouseBuilder = new AsianHouseBuilder();
        ArrayList<String> houseMaterials = new ArrayList<String>();
        Position position = new Position(0,0);
        Dimensions dimensions = new Dimensions(2,2);
        houseMaterials.add("bamboo");
        House house1 = asianHouseBuilder
                .constructRoof("Asian Roof")
                .definePositions(position)
                .defineDimensions(dimensions)
                .buildStructure(houseMaterials).getResult();
        HouseOnMapDecorator houseOnMap = new HouseOnMapDecorator(house1);
            houseOnMap.initialiseHouseOnMap(board);
        ArrayList<String> houseMaterials2 = new ArrayList<String>();
        Position position2 = new Position(1,3);
        Dimensions dimensions2 = new Dimensions(2,2);
        houseMaterials.add("bamboo");
        House house2 = asianHouseBuilder
                .constructRoof("Asian Roof")
                .definePositions(position2)
                .defineDimensions(dimensions2)
                .buildStructure(houseMaterials2).getResult();
        HouseOnMapDecorator houseOnMap2 = new HouseOnMapDecorator(house2);
        houseOnMap2.initialiseHouseOnMap(board);
    }
}
