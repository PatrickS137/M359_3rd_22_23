package Unit5.notes.HeroVillainExample;

import static Unit5.notes.HeroVillainExample.SuperHero.getTotalHeroStrength;

public class MarvelMovieTester {
    public static void main(String[] args) {
        SuperHero ironMan = new SuperHero("Iron Man", "Rich, Smart,Super suit",
                100);
        //System.out.println(ironMan);

        Villain thanos = new Villain("Thanos", "Snap",150);
        //System.out.println(thanos);

        epicBattle(ironMan,thanos,5);
        //System.out.println(ironMan);
        //System.out.println(thanos);

        System.out.println(getTotalHeroStrength());
    }

    //if you type /** and press enter IntelliJ will start your JavaDoc comments for you
    //do this after method header created

    /**
     * This method will replicate a battle between a hero and a villain aand each will take on
     * damage accordingly
     * @param hero the good guy
     * @param villain the bad gut
     */
    public static void battle(SuperHero hero, Villain villain) {
        // if hero is stronger they have 75% chance of winning
        // winner takes 10% damage
        //loser tales 35% damage
        if (hero.getHeroPower().getPowerStrength() > villain.getvillainPower().getPowerStrength()){
            double winChance = Math.random();
            if (winChance < 0.75){ // hero won
                //update hero strength = 0.9*strength
                hero.updateStrengthAfterBattle(0.9);
                //update villain strength = 0.65*strength
            }
            else{ // villain won
                //update hero strength = 0.65*strength
                hero.updateStrengthAfterBattle(0.65);
                //update villain strength = 0.9*strength
                villain.updateStrengthAfterBattle(0.65);
            }
        }
        else{ //hero has less strength, so they have 25% of winning
            double winChance = Math.random();
            if (winChance < 0.25){// hero won
                //update hero strength = 0.9*strength
                hero.updateStrengthAfterBattle(0.9);
                //update villain strength = 0.65*strength
                villain.updateStrengthAfterBattle(0.65);
            }
            else{ // villain won
                //update hero strength = 0.65*strength
                hero.updateStrengthAfterBattle(0.65);
                //update villain strength = 0.9*strength
                villain.updateStrengthAfterBattle(0.9);
            }
        }
    }

    /**
     * this method calls battle numRounds times to simulate a long running fight
     * between good and evil
     * @param hero the superHero
     * @param villain the villain
     * @param numRounds the number of times the two battle
     */
    public static void epicBattle (SuperHero hero, Villain villain, int numRounds) {
        for (int i = 0;i<numRounds; i++){
            battle(hero,villain);
            System.out.println(hero);
            System.out.println(villain);
        }
    }
}
