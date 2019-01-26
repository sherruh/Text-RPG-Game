package heroes;

import entities.AbilityType;

import java.util.Random;

public class Medic extends Hero{
    public Medic(int health, int attack) {
        super(health, attack, AbilityType.HEAL);
    }

    @Override
    public void useAbility(Hero heroes[]) {
        if (this.health > 0) {
            Random random = new Random();
            int luckyHeroIndex = random.nextInt(3);
            heroes[luckyHeroIndex].setHealth(heroes[luckyHeroIndex].getHealth() + (random.nextInt(5)+1));

        }
    }
}
