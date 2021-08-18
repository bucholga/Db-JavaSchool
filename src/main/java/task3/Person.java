package task3;

import java.util.Locale;

public class Person extends Hero {
    public String kick(Hero c) {
        int dicreaseAmount = RndCalculator.rnd(0, this.power);
        c.hp -= dicreaseAmount;
        return this.getClass().getSimpleName().toLowerCase(Locale.ROOT)+" "+name + " kicked "+ c.getClass().getSimpleName().toLowerCase(Locale.ROOT)+ " " + c.name+ " for " + dicreaseAmount + " hp";
    }

}
