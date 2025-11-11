import Characters.AbstractCharacter;
import Characters.CharacterFactory.Factory;
import Characters.CharacterFactory.HumanFactory;
import Characters.HumanCharacter;
import Houses.AsianHouse;
import Houses.House;
import Houses.HouseBuilder.AsianHouseBuilder;
import Houses.HouseBuilder.HouseBuilder;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        //house building
        HouseBuilder asianHouseBuilder = new AsianHouseBuilder();
        ArrayList<String> houseMaterials = new ArrayList<String>();
        Position position = new Position(1,2);
        Dimensions dimensions = new Dimensions(1,1);
        houseMaterials.add("bamboo");
        House house = new AsianHouse();
        house = asianHouseBuilder
                .defineDimensions(dimensions)
                .buildStructure(houseMaterials).getResult();
        System.out.println(house);

        //Character creation
        Factory humanfactory = new HumanFactory();
        AbstractCharacter human =  humanfactory.createCharacter(10,position,30);
        System.out.println(human);

        ////////////////////
    /* Patterns used
     * Creational
     * 1. Factory Method - character type creation
     * 2. Abstract factory
     * /3. Singleton - Board creation (has to be the same exact board throughout the program)
     * /4. Builder - scene building (1. Board Creation; 2. House Creation; 3. People creation)
     *             - house creation
     * Structural
     * 5. Decorator -
     * /6. Composite - Character types
     *              - House Types (working with houses refferenced through general House class)
     * Behavioral
     * 7. Command - Character / Group moving
    */
}
}