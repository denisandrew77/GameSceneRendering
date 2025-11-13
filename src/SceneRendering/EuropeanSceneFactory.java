package SceneRendering;

import Board.Board;
import Characters.AbstractCharacter;
import Characters.CharacterFactory.HumanFactory;
import Characters.CharacterMove.MovingDecorator;
import Houses.House;
import Houses.HouseBuilder.AsianHouseBuilder;
import Houses.HouseBuilder.EuropeanHouseBuilder;
import Houses.HouseInitializationOnMap.HouseOnMapDecorator;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class EuropeanSceneFactory implements AbstractSceneFactory{

    @Override
    public void createHouses(Board board) {
        EuropeanHouseBuilder euroHouseBuilder = new EuropeanHouseBuilder();
        ArrayList<String> houseMaterials = new ArrayList<String>();
        Position position = new Position(2,2);
        Dimensions dimensions = new Dimensions(1,2);
        houseMaterials.add("concrete");
        House house1 = euroHouseBuilder
                .definePositions(position)
                .defineDimensions(dimensions)
                .buildStructure(houseMaterials).getResult();
        HouseOnMapDecorator houseOnMap = new HouseOnMapDecorator(house1);
        houseOnMap.initialiseHouseOnMap(board);
        ArrayList<String> houseMaterials2 = new ArrayList<String>();
        Position position2 = new Position(1,5);
        Dimensions dimensions2 = new Dimensions(2,2);
        houseMaterials2.add("concrete");
        House house2 = euroHouseBuilder
                .definePositions(position2)
                .defineDimensions(dimensions2)
                .buildStructure(houseMaterials2).getResult();
        HouseOnMapDecorator houseOnMap2 = new HouseOnMapDecorator(house2);
        houseOnMap2.initialiseHouseOnMap(board);
    }
}
