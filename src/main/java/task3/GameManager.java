package task3;

import java.util.HashSet;

public class GameManager{
    public void fight(Hero h1, Hero h2){

        while (h1.isAlive() && h2.isAlive())
        {
            System.out.println("Hero1: " + h1.name + " "+ h1.power + " "+ h1.hp);
            System.out.println("Hero2: " + h2.name + " "+ h2.power + " "+ h2.hp);
            System.out.println(h1.kick(h2));
            System.out.println(h2.kick(h1));
        }

    }
}
