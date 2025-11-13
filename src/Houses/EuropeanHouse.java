package Houses;

import Others.Dimensions;
import Others.Position;

public class EuropeanHouse extends House{
    private String builtOf;
    public EuropeanHouse(){}

    public String getBuiltOf() {
        return builtOf;
    }

    public void setBuiltOf(String builtOf) {
        this.builtOf = builtOf;
    }

    @Override
    public String toString(){
        return "European House: Position: "+
                this.getPosition().getX()+" "+this.getPosition().getY()+
                ", Size: "+this.getDimensions().getWidth()+"x"+this.getDimensions().getLength()+
                "Built of: "+builtOf;
    }
}