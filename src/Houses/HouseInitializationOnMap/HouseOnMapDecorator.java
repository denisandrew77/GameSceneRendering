package Houses.HouseInitializationOnMap;

import Board.Board;
import Houses.House;
import Others.BoardPosition;
import Others.Position;

public class HouseOnMapDecorator extends BaseHouseDecorator{

    public HouseOnMapDecorator(House wrappee) {
        super(wrappee);
    }

    @Override
    public void initialiseHouseOnMap(Board board){
        int x = this.getWrappee().getPosition().getX();
        int y = this.getWrappee().getPosition().getY();
        int length = this.getWrappee().getDimensions().getLength();
        int width = this.getWrappee().getDimensions().getWidth();
        boolean canPutHouse = true;
        for(int i = x; i<x+width; i++){
            for(int j=y; j<y+length; j++){
                Position position = new Position(i,j);
                if(!board.verifyPosition(position) || board.verifyOcuppiedPosition(board.getGameBoard()[i][j])){
                    System.out.println("Here");
                    canPutHouse = false;
                }
            }
        }
        if(canPutHouse){
            for(int i = x; i<x+width; i++){
                for(int j=y; j<y+length; j++){
                    board.getGameBoard()[i][j].setOccupied(true);
                }
            }
            board.addSceneElement(this.getWrappee().toString());
            System.out.println("House Initilised succesfully "+x+" "+y);
        }
        else{
            System.out.println("Can't initialise house");
        }
    }
}
