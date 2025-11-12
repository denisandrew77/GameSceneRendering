import Board.Board;
import Characters.AbstractCharacter;
import Characters.CharacterFactory.Factory;
import Characters.CharacterFactory.HumanFactory;
import Characters.CharacterMove.BaseMovingDecorator;
import Characters.CharacterMove.MovingDecorator;
import Characters.HumanCharacter;
import Houses.AsianHouse;
import Houses.House;
import Houses.HouseBuilder.AsianHouseBuilder;
import Houses.HouseBuilder.HouseBuilder;
import Houses.HouseInitializationOnMap.HouseOnMapDecorator;
import Others.BoardPosition;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //house building
        HouseBuilder asianHouseBuilder = new AsianHouseBuilder();
        ArrayList<String> houseMaterials = new ArrayList<String>();
        Position position = new Position(2,2);
        Dimensions dimensions = new Dimensions(2,4);
        houseMaterials.add("bamboo");
        House house1 = asianHouseBuilder
                .definePositions(position)
                .defineDimensions(dimensions)
                .buildStructure(houseMaterials).getResult();
        System.out.println(house1);

        //Character creation
        Position position2 = new Position(2,3);
        Factory humanfactory = new HumanFactory();
        AbstractCharacter human =  humanfactory.createCharacter(10,position2,30);
        System.out.println(human);

        //Board creation
        Dimensions boardDimensions = new Dimensions(4,11);
        Board board = Board.getBoard(boardDimensions);
        board.visualizeBoard();
        // adding characters
        MovingDecorator movingCharacter = new MovingDecorator(human);
        System.out.println(movingCharacter.getCharacter().getPosition().getX()+" "+movingCharacter.getCharacter().getPosition().getY() );
        movingCharacter.initialiseOnMap(board);

        // adding houses
        HouseOnMapDecorator houseOnMap = new HouseOnMapDecorator(house1);
        houseOnMap.initialiseHouseOnMap(board);
        board.visualizeBoard();

        //Move character
        Position position3 = new Position(1,3);
        movingCharacter.moveCharacterTo(board,position3);
        board.visualizeBoard();

        ////////////////////
    /* Patterns used
     * Creational
     * /1. Factory Method - character type creation
     * 2. Abstract factory
     * /3. Singleton - Board creation (has to be the same exact board throughout the program)
     * /4. Builder - scene building (1. Board Creation; 2. House Creation; 3. People creation)
     *             - house creation
     * Structural
     * /5. Decorator - Moving the character/characters (wrap the character in the ability to move)
     *               - Initialise House on a map
     * /6. Composite - Character types
     *              - House Types (working with houses refferenced through general House class)
     * Behavioral
     * 7. Command - Character / Group moving
    */
}
}