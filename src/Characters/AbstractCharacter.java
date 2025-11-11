package Characters;

import java.util.ArrayList;

import Others.Position;

public abstract class AbstractCharacter {
    private int age;
    private Position position;
    private int size;
    private ArrayList<String> abilities = new ArrayList<String>();

    public AbstractCharacter(int age, Position position, int size) {
        this.age = age;
        this.position = position;
        this.size = size;
    }

    public int getAge() {
        return age;
    }

    public Position getPosition() {
        return position;
    }

    public int getSize() {
        return size;
    }
    
    public void addAbility(String ability){
        abilities.add(ability);
    }
    
}
