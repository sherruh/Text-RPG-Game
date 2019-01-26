package heroes;

import entities.AbilityType;

import java.util.Random;

public class Hunter extends Hero {

    public Hunter(int health, int attack) {
        super(health, attack, AbilityType.CRITICAL_DAMAGE);
    }

    public int getAttack(){
        return  this.attack+(new Random().nextInt(5)+1);
    }

    @Override
    public void useAbility(Hero[] heroes) {
        if (this.health>0){
            this.attack=getAttack();
        }
    }
}
