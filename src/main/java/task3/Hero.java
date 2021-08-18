package task3;

public abstract class Hero {
    public String name;
    public int power;
    public int hp;
    public abstract String kick(Hero c);
    public boolean isAlive(){
        return hp > 0;
    }

}
