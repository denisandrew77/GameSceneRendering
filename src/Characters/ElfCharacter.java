package Characters;

import Others.Position;

public class ElfCharacter extends AbstractCharacter{
    public ElfCharacter(int age, Position position, int size){
        super(age, position, size);
    }

    @Override
    public String toString(){
        return "ElfCharacter: "+"age: "+this.getAge()+", position: "+this.getPosition().getX()+" "+getPosition().getY()+", size: "+this.getSize();
    }
}
