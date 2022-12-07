package Unit5.notes.HeroVillainExample;

public class SuperHero {
    private String heroName;
    private Power heroPower;
    //this static value needs to be initialized to 0 so that we can update
    //it each time we create a new hero
    private static int numHeroes = 0;
    private static int totalHeroStrength = 0;
    public SuperHero (String heroName, Power heroPower) {
        this.heroName = heroName;
        this.heroPower = heroPower;
        //this copies the reference to an already created power object

        numHeroes ++;
        totalHeroStrength += heroPower.getPowerStrength();
    }

    public SuperHero (String heroName, String powerName, int powerStrength) {
        this.heroName = heroName;
        this.heroPower = new Power (powerName, powerStrength);
        //here we create a new power object with the passed in name and strength

        numHeroes ++;
        totalHeroStrength += heroPower.getPowerStrength();

    }
    public void updateStrengthAfterBattle(double percent){
        //figure how much to subtract from totalHeroStrength before calling getstrength

        totalHeroStrength -= ((int)((1-percent) * heroPower.getPowerStrength()));
        heroPower.setPowerStrength((int)(percent * heroPower.getPowerStrength()));
    }

    public String toString() {
        String str = "This Super Hero is named: " + heroName + "\n";
        if (heroPower != null) {
            str +=heroPower.toString();
        }

        //calls toString and adds the returned
                                    //String from power class to this string we are building
                                    //up here inside the superhero class
        return str;
    }


    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public Power getHeroPower() {
        return heroPower;
    }

    public void setHeroPower(Power heroPower) {
        this.heroPower = heroPower;
    }

    //because it is static it is called by classname.methodname
    //SuperHero.getNumHeroes();
    public static int getNumHeroes(){
        return(numHeroes);
    }

    public static int getTotalHeroStrength() {
        return totalHeroStrength;
    }
}
