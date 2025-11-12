package Characters.CharacterMove;

import Board.Board;
import Characters.AbstractCharacter;
import Others.BoardPosition;
import Others.Position;

public class MovingDecorator extends  BaseMovingDecorator{

    public MovingDecorator(AbstractCharacter wrappee){
        super(wrappee);
    }

    @Override
    public void moveCharacterTo(Board board, Position position) {
        if(board.verifyPosition(position) && !board.verifyOcuppiedPosition(position)){
            System.out.println("Position changed: " + position.getX()+" "+ position.getY());
            //change previous position back to false
            board.getGameBoard()[this.getCharacter().getPosition().getX()][this.getCharacter().getPosition().getY()].setOccupied(false);
            //change its new position to true
            board.getGameBoard()[position.getX()][position.getY()].setOccupied(true);
            System.out.println("Value: " + board.getGameBoard()[position.getX()][position.getY()].isOccupied());
        }
        else System.out.println(position.getX()+" "+ position.getY()+"Invalid position, character can not be moved");
    }

    public void initialiseOnMap(Board board){
        BoardPosition position = new BoardPosition(this.getCharacter().getPosition().getX(),this.getCharacter().getPosition().getY(),true);
        if(board.verifyPosition(position)){
            board.setOccupiedPosition(position);
            System.out.println("Character successfully initialised on map");
        }
        else System.out.println("Cannot put on map");
    }
}
