package task3;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Hobbit extends Hero {

    public Hobbit(String name){
        hp = 3;
        power = 0;
        this.name = name;
    }

    public String kick(Hero c){
        return name+ ": I am crying";
    }

}
