package Characters.CharactersGroup;

import Board.Board;
import Characters.AbstractCharacter;

import java.util.ArrayList;

public interface CharacterGroupCommand {
    void moveGroup(Board board, ArrayList<AbstractCharacter> characters, int moveBy);
}
