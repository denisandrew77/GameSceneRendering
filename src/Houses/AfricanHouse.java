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
}
