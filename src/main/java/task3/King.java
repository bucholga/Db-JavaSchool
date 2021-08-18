package task3;

import lombok.ToString;

@ToString
public class King extends Person{
    public King(String name){
        hp = RndCalculator.rnd(5, 15);
        power = RndCalculator.rnd(5,15);
        this.name = name;
    }
}
