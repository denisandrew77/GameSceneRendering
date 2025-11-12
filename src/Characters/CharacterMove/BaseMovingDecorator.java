package Characters.CharacterMove;

import Board.Board;
import Characters.AbstractCharacter;
import Others.BoardPosition;
import Others.Position;

public abstract class BaseMovingDecorator {
    private AbstractCharacter wrappee;

    public BaseMovingDecorator(AbstractCharacter wrappee){
        this.wrappee = wrappee;
    }

    public abstract void moveCharacterTo (Board board, Position position);

    public AbstractCharacter getCharacter() {
        return wrappee;
    }
}
