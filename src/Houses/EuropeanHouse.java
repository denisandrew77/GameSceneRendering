package Houses;

import Others.Dimensions;
import Others.Position;

public class EuropeanHouse extends House{
    private String builtOf;
    public EuropeanHouse(Position position, Dimensions dimensions, String builtOf){
        super(position,dimensions);
        this.builtOf=builtOf;
    }

    public String getBuiltOf() {
        return builtOf;
    }

    public void setBuiltOf(String builtOf) {
        this.builtOf = builtOf;
    }
}