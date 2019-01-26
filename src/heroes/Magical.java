package heroes;

import entities.AbilityType;

import java.util.Random;

public class Magical extends Hero{
    public Magical(int health, int attack) {
        super(health, attack, AbilityType.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes) {
        if (this.health>0){
            Random random = new Random();
            int luckyHeroIndex = random.nextInt(3);
            heroes[luckyHeroIndex].setAttack(heroes[luckyHeroIndex].getAttack()+(random.nextInt(5)+1));
        }
    }
}
