package Characters.CharacterMove;

import Board.Board;
import Characters.AbstractCharacter;
import Others.Position;

import java.util.ArrayList;

public class GroupMovingDecorator  extends GroupBaseMovingDecorator{
    public GroupMovingDecorator(ArrayList<AbstractCharacter> characters) {
        super(characters);
    }

    @Override
    public void moveGroupBy(Board board, int moveBy) {
        for(int i = 0; i < this.getCharacters().size(); i++){
            //first time try to move all characters by length
            Position position = new Position(this.getCharacters().get(i).getPosition().getX()+moveBy,this.getCharacters().get(i).getPosition().getY());
            if(board.verifyPosition(position)){
                System.out.println("Group moved successfully by length");
            }
            else{
                Position position2 = new Position(this.getCharacters().get(i).getPosition().getX()+moveBy,this.getCharacters().get(i).getPosition().getY());
                if(board.verifyPosition(position2)){
                    System.out.println("Group moved successfully by width");
                }
                else{
                    System.out.println("Invalid position");
                }
            }
        }
    }


}
