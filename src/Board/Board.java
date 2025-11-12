package Board;

import Characters.AbstractCharacter;
import Others.BoardPosition;
import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

//using Singleton pattern
public class Board {
    private Dimensions dimensions;
    private BoardPosition[][] gameBoard;
    private static Board boardObject;

    private Board(Dimensions dimensions){
        this.dimensions = dimensions;
        this.gameBoard = new BoardPosition[dimensions.getWidth()][dimensions.getLength()];
        for(int i=0;i<dimensions.getWidth();i++){
            for(int j=0;j<dimensions.getLength();j++){
                this.gameBoard[i][j] = new BoardPosition(j,i,false);
            }
        }
    }

    public static Board getBoard(Dimensions dimensions){
        if(boardObject==null){
            boardObject = new Board(dimensions);
            return boardObject;
        }
        else return  boardObject;
    }

    public Dimensions getDimensions(){
        return dimensions;
    }

    public BoardPosition[][] getGameBoard(){
        return gameBoard;
    }

    public void resetBoard(){
        for(int i = 0; i < dimensions.getWidth(); i++){
            for(int j = 0; j < dimensions.getLength(); j++){
                gameBoard[i][j].setOccupied(false);
            }
        }
    }

    public void setOccupiedPosition(Position position){
        System.out.print(position.getX()+" "+position.getY());
        if(this.verifyPosition(position)){
            gameBoard[position.getX()][position.getY()].setOccupied(true);
        }
        else System.out.print(" Occupied spot");
    }

    public void setOccupiedPositionForGroup(ArrayList<AbstractCharacter> group){
        for(int i=0;i<group.size();i++){
           gameBoard[group.get(i).getPosition().getY()][group.get(i).getPosition().getX()].setOccupied(true);
        }
    }

    public boolean verifyPosition(Position position){
        if(position.getX()>= dimensions.getWidth()
                || position.getX()<0
                || position.getY()<0
                || position.getY()>= dimensions.getLength()) {
            System.out.println("Positions:" + position.getX()+" "+ position.getY());
            return false;
        }
        else return true;
    }

    public boolean verifyOcuppiedPosition(Position position){
        if(verifyPosition(position)){
            System.out.println("Positions in first:" + position.getX()+" "+ position.getY());
            if(this.getGameBoard()[position.getX()][position.getY()].isOccupied()){
                System.out.println("Positions in second:" + position.getX()+" "+ position.getY());
                return true;
            }
        }
        return false;
    }

    public void visualizeBoard(){
        for(int i = 0; i < dimensions.getWidth(); i++){
            for(int j = 0; j < dimensions.getLength(); j++){
                System.out.print(i+" "+j+" ");
                System.out.print(gameBoard[i][j].isOccupied()+" ");
            }
            System.out.println();
        }
    }

}
