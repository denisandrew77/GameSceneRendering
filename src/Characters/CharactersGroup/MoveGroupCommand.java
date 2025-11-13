package Characters.CharactersGroup;

import Board.Board;
import Characters.AbstractCharacter;

import Characters.CharacterMove.MovingDecorator;
import Others.Position;
import java.util.ArrayList;

public class MoveGroupCommand implements CharacterGroupCommand {

    private Board board;
    private ArrayList<AbstractCharacter> characters;
    private int moveBy;


    @Override
    public void moveGroup(Board board, ArrayList<AbstractCharacter> characters, int moveBy) {
        this.board = board;
        this.characters = characters;
        this.moveBy = moveBy;
        boolean canMoveGroup = true;
        for(int i=0;i< characters.size();i++){
            AbstractCharacter character = characters.get(i);
            Position newPosition = new Position(character.getPosition().getX(), character.getPosition().getY()+moveBy);
            if(board.verifyOcuppiedPosition(newPosition) || !board.verifyPosition(newPosition)){
                canMoveGroup = false;
            }
        }
        if(canMoveGroup){
            for(int i=0;i< characters.size();i++){
                AbstractCharacter character = characters.get(i);
                MovingDecorator movingDecorator = new MovingDecorator(character);
                Position newPosition = new Position(character.getPosition().getX(), character.getPosition().getY()+moveBy);
                movingDecorator.moveCharacterTo(board,newPosition);
            }
            System.out.println("Moved group by "+moveBy);
        }
        else System.out.println("Couldn't move group");
    }
}
