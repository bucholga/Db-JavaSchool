package task3;

public class Main {
    public static void main(String[] args) {
        HeroStorage heroStorage = new HeroStorage();
        HeroFactory heroFactory = new HeroFactory();
        GameManager gameManager = new GameManager();
        heroStorage.addHero(heroFactory.createHero("Aaron"));
        heroStorage.addHero(heroFactory.createHero("Brianna"));
        heroStorage.addHero(heroFactory.createHero("Caleb"));
        heroStorage.addHero(heroFactory.createHero("Delia"));
        heroStorage.addHero(heroFactory.createHero("Eric"));
        heroStorage.addHero(heroFactory.createHero("Faith"));
        heroStorage.addHero(heroFactory.createHero("Geoffrey"));
        heroStorage.addHero(heroFactory.createHero("Hailey"));
        heroStorage.addHero(heroFactory.createHero("Ian"));
        heroStorage.addHero(heroFactory.createHero("Jasmine"));
        heroStorage.addHero(heroFactory.createHero("Katelyn"));
        int count = 1;
        while (heroStorage.aliveHeroes.size() > 1){
            int num1 = RndCalculator.rnd(0, heroStorage.aliveHeroes.size()-1);
            int num2 = RndCalculator.rnd(0, heroStorage.aliveHeroes.size()-1);
            while (num1 == num2){
                num2 = RndCalculator.rnd(0, heroStorage.aliveHeroes.size()-1);
            }
            Hero hero1 = (Hero)heroStorage.aliveHeroes.toArray()[num1];
            Hero hero2 = (Hero)heroStorage.aliveHeroes.toArray()[num2];
            System.out.println("Fight number " + count);
            gameManager.fight(hero1, hero2);
            if (!hero1.isAlive()){
                heroStorage.deleteHero(hero1);
            }
            if (!hero2.isAlive()){
                heroStorage.deleteHero(hero2);
            }
            count++;
        }
        if (heroStorage.aliveHeroes.size() == 1){

        System.out.println("The winner is..."+ ((Hero)heroStorage.aliveHeroes.toArray()[0]).name);
        }
        else{
            System.out.println("No winner today, all dead");
        }


    }
}
