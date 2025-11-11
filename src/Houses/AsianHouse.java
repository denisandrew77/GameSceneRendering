package Houses;

import Others.Dimensions;
import Others.Position;

public class AsianHouse extends  House{
    private String builtOf;
    private String roofType;
    public AsianHouse(Position position, Dimensions dimensions,String roofType, String builtOf){
        super(position,dimensions);
        this.builtOf=builtOf;
        this.roofType=roofType;
    }

    public String getBuiltOf() {
        return builtOf;
    }

    public String getRoofType() {
        return roofType;
    }

    public void setBuiltOf(String builtOf) {
        this.builtOf = builtOf;
    }

    public void setRoofType(String roofType) {
        this.roofType = roofType;
    }
    
}
