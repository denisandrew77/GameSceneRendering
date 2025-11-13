package Houses;

import Others.Dimensions;
import Others.Position;

import java.util.ArrayList;

public class AfricanHouse extends House{
    private ArrayList<String> materials = new ArrayList<String>();

    public AfricanHouse() {}

    public ArrayList<String> getMaterials() {
        return materials;
    }

    public void setMaterials(ArrayList<String> materials) {
        this.materials = materials;
    }

    @Override
    public String toString(){
        return "African House: Position: "+
                this.getPosition().getX()+" "+this.getPosition().getY()+
                ", Size: "+this.getDimensions().getWidth()+"x"+this.getDimensions().getLength()+
                "Materials: "+this.getMaterials();
    }
}
