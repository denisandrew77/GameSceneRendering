package Board;

import Others.BoardPosition;
import Others.Dimensions;

//using Singleton pattern
public class Board {
    private Dimensions dimensions;
    private BoardPosition[][] gameBoard;
    private static Board boardObject;

    private Board(Dimensions dimensions){
        this.dimensions = dimensions;
        this.gameBoard = new BoardPosition[dimensions.getWidth()][dimensions.getLength()];
    }

    public Board getBoard(){
        if(boardObject==null){
            boardObject = new Board(this.dimensions);
            return boardObject;
        }
        else return  boardObject;
    }

}
