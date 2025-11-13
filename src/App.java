import Board.Board;
import Characters.AbstractCharacter;
import Characters.CharacterFactory.Factory;
import Characters.CharacterFactory.HumanFactory;
import Characters.CharacterMove.BaseMovingDecorator;
import Characters.CharacterMove.MovingDecorator;
import Characters.CharactersGroup.MoveGroupCommand;
import Characters.HumanCharacter;
import Houses.AsianHouse;
import Houses.House;
import Houses.HouseBuilder.AsianHouseBuilder;
import Houses.HouseBuilder.HouseBuilder;
import Houses.HouseInitializationOnMap.HouseOnMapDecorator;
import Others.BoardPosition;
import Others.Dimensions;
import Others.Position;
import SceneRendering.AbstractSceneFactory;
import SceneRendering.AfricanSceneFactory;
import SceneRendering.AsianSceneFactory;
import SceneRendering.EuropeanSceneFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Width: ");
        Scanner widthInput = new Scanner(System.in);
        int width = widthInput.nextInt();

        System.out.println("Length: ");
        Scanner lengthInput = new Scanner(System.in);
        int length = lengthInput.nextInt();

        System.out.println("Scene Type: ");
        Scanner sceneTypeInput = new Scanner(System.in);
        String sceneType = sceneTypeInput.nextLine();

        //creating the scene - part 1
        AbstractSceneFactory sceneFactory;

        switch (sceneType) {
            case "asian":
                sceneFactory = new AsianSceneFactory();
                break;
            case "african":
                sceneFactory = new AfricanSceneFactory();
                break;
            case "european":
                sceneFactory = new EuropeanSceneFactory();
                break;
            default:
                sceneFactory = new AsianSceneFactory();
        }
        //Board creation
        Dimensions boardDimensions = new Dimensions(width,length);
        Board board = Board.getBoard(boardDimensions);
        //creating scene - part 2
        sceneFactory.createHouses(board);
        board.visualizeBoard();
        System.out.println("\n");
        //Character 1
        Position position4 = new Position(0,0);
        HumanFactory humanFactory = new HumanFactory();
        AbstractCharacter human1 =  humanFactory.createCharacter(190,position4,300);
        System.out.println(human1);
        MovingDecorator movingCharacter4 = new MovingDecorator(human1);
        System.out.println(movingCharacter4.getCharacter().getPosition().getX()+" "+movingCharacter4.getCharacter().getPosition().getY() );
        movingCharacter4.initialiseOnMap(board);
        //Character 2
        Position position5 = new Position(0,2);
        AbstractCharacter human2 =  humanFactory.createCharacter(120,position5,200);
        System.out.println(human2);
        MovingDecorator movingCharacter5 = new MovingDecorator(human2);
        System.out.println(movingCharacter5.getCharacter().getPosition().getX()+" "+movingCharacter5.getCharacter().getPosition().getY() );
        movingCharacter5.initialiseOnMap(board);
        //Character 3
        Position position6 = new Position(1,0);
        AbstractCharacter human3 =  humanFactory.createCharacter(10,position6,20);
        System.out.println(human3);
        MovingDecorator movingCharacter6 = new MovingDecorator(human3);
        System.out.println(movingCharacter6.getCharacter().getPosition().getX()+" "+movingCharacter5.getCharacter().getPosition().getY() );
        movingCharacter6.initialiseOnMap(board);

        //visualize board
        board.visualizeBoard();

        //Moving a group
        ArrayList<AbstractCharacter> characters = new ArrayList<AbstractCharacter>();
        characters.add(human1);
        characters.add(human2);
        MoveGroupCommand moveGroupCommand = new MoveGroupCommand();
        moveGroupCommand.moveGroup(board,characters,1);
        board.visualizeBoard();

        //Moving character
        Position position3 = new Position(1,2);
        movingCharacter6.moveCharacterTo(board,position3);
        board.visualizeBoard();

        board.render();
        ////////////////////
    /* Patterns used
     * Creational
     * 1. Factory Method - character type creation
     * 2. Abstract factory - scene creation
     * 3. Singleton - Board creation (has to be the same exact board throughout the program)
     * 4. Builder - scene building (1. Board Creation; 2. House Creation; 3. People creation)
     *             - house creation
     * Structural
     * 5. Decorator - Moving the character/characters (wrap the character in the ability to move)
     *               - Initialise House on a map
     * 6. Composite - Character types
     *              - House Types (working with houses refferenced through general House class)
     * Behavioral
     * 7. Command - Moving a group
    */
}
}