package Characters.CharacterFactory;

import Characters.AbstractCharacter;
import Others.Position;

public interface Factory {
    AbstractCharacter createCharacter(int age, Position position,int size);
}
