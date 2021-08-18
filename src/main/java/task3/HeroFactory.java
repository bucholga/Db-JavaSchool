package task3;

import lombok.SneakyThrows;
import org.reflections.Reflections;


import java.util.Set;

public class HeroFactory{
    public Set<?> subClasses;
    @SneakyThrows
    public Hero createHero(String name){

        Package pack = this.getClass().getPackage();
        Reflections reflections = new Reflections(pack.getName());
        subClasses = reflections.getSubTypesOf(Hero.class);
        subClasses.remove(Person.class);//I know, this is horrible, sorry
        int classType = RndCalculator.rnd(0, subClasses.size()-1);

        Class cl = (Class) subClasses.toArray()[classType];
        Hero newHero = (Hero) cl.getConstructor(new Class[] {String.class}).newInstance(new Object[] {name});
        return newHero;

    }
}
