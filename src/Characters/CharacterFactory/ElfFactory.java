package Characters.CharacterFactory;

import Characters.AbstractCharacter;
import Characters.ElfCharacter;
import Others.Position;

public class ElfFactory implements Factory {
    @Override
    public AbstractCharacter createCharacter(int age, Position position, int size) {
        return new ElfCharacter(age, position, size);
    }
}
