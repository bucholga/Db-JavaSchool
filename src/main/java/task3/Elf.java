package task3;

import lombok.ToString;

import java.util.Locale;
@ToString
public class Elf extends Hero{

    public Elf(String name){
        hp = 10;
        power = 10;
        this.name = name;
    }

    public String kick(Hero c){
        if (c.power < this.power){
            c.hp = 0;
            return this.getClass().getSimpleName().toLowerCase(Locale.ROOT)+" "+name + " killed " + c.getClass().getSimpleName().toLowerCase(Locale.ROOT)+ " " + c.name;
        }
        else{
            c.power--;
            return this.getClass().getSimpleName().toLowerCase(Locale.ROOT)+" "+name + " decreased power by 1 of " + c.getClass().getSimpleName().toLowerCase(Locale.ROOT) + " " + c.name;
        }

    }
}
