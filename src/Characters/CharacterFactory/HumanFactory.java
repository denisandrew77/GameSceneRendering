package Characters.CharacterFactory;

import Characters.AbstractCharacter;
import Characters.HumanCharacter;
import Others.Position;

public class HumanFactory implements Factory{

    @Override
    public AbstractCharacter createCharacter(int age, Position position, int size) {
        return new HumanCharacter(age, position, size);
    }
}
