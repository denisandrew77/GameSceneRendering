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
    private ArrayList<String> sceneElements;


    private Board(Dimensions dimensions){
        this.dimensions = dimensions;
        this.gameBoard = new BoardPosition[dimensions.getWidth()][dimensions.getLength()];
        this.sceneElements = new ArrayList<String>();
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


    public boolean verifyPosition(Position position){
        if(position.getX()>= dimensions.getWidth()
                || position.getX()<0
                || position.getY()<0
                || position.getY()>= dimensions.getLength()) {
            return false;
        }
        else return true;
    }

    public boolean verifyOcuppiedPosition(Position position){
        if(verifyPosition(position)){
            if(this.getGameBoard()[position.getX()][position.getY()].isOccupied()){
                return true;
            }
        }
        return false;
    }

    public void visualizeBoard(){
        for(int i = 0; i < dimensions.getWidth(); i++){
            for(int j = 0; j < dimensions.getLength(); j++){

                if(gameBoard[i][j].isOccupied()){
                    System.out.print(1+" ");
                } else{
                    System.out.print(0+" ");
                }

            }
            System.out.println();
        }
    }
    public void render() {
        for(String element: sceneElements){
            System.out.println(element.toString());
        }
    }

    public void addSceneElement(String element) {
        sceneElements.add(element);
    }
}
