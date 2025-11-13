package Characters;

import Others.Position;

public class HumanCharacter extends AbstractCharacter{

    public HumanCharacter(int age, Position position, int size){
        super(age, position, size);
    }

    @Override
    public String toString(){
        return "ElfCharacter: "+"age: "+this.getAge()+", position: "+this.getPosition().getX()+" "+getPosition().getY()+", size: "+this.getSize();
    }
}
