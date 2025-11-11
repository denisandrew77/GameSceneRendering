package Houses;

import Others.Dimensions;
import Others.Position;

public abstract class House {
    private Position position;
    private Dimensions dimensions;

    public House(Position position, Dimensions dimensions){
        this.position=position;
        this.dimensions=dimensions;
    }

    public Position getPosition() {
        return position;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void setDimensions(Dimensions dimensions) {
        this.dimensions = dimensions;
    }
    
}
