package task3;

import lombok.ToString;

@ToString
public class Knight extends Person{
    public Knight(String name) {
        hp = RndCalculator.rnd(2, 12);
        power = RndCalculator.rnd(2, 12);
        this.name = name;
    }
}
