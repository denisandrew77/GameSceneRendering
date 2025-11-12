package Others;

public class BoardPosition extends Position{
    private boolean occupied;
    public BoardPosition(int x, int y, boolean occupied){
        super(x, y);
        this.occupied=occupied;
    }

    public boolean isOccupied() {
        return occupied;
    }
    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }
}
