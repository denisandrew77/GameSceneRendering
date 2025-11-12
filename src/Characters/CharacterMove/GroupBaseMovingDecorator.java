package Characters.CharacterMove;

import Board.Board;
import Characters.AbstractCharacter;

import java.util.ArrayList;

public abstract class GroupBaseMovingDecorator {
    private ArrayList<AbstractCharacter> characters;

    public GroupBaseMovingDecorator(ArrayList<AbstractCharacter> characters) {
        this.characters = characters;
    }

    public ArrayList<AbstractCharacter> getCharacters() {
        return characters;
    }

    public abstract void moveGroupBy(Board board, int movedBy);
}
