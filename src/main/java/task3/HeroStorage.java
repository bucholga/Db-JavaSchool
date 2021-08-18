package task3;


import java.util.HashSet;
import java.util.Set;

public class HeroStorage {
    public HashSet<Hero> aliveHeroes;

    public HeroStorage(){
        this.aliveHeroes = new HashSet<Hero>();
    }

    public void deleteHero(Hero hero){
        System.out.println( hero.name+ " is dead now");
        aliveHeroes.remove(hero);
    }

    public void addHero(Hero hero) {
        aliveHeroes.add(hero);
    }
}
