package heroes;

import entities.AbilityType;
import entities.GameEntity;

public abstract class Hero extends GameEntity {

    public Hero(int health, int attack, AbilityType abilityType) {
        super(health, attack);
        this.abilityType=abilityType;
    }

    protected AbilityType abilityType;

    public void useAbility(Hero heroes[]){

    }
}
