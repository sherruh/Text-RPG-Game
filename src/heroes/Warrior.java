package heroes;

        import entities.AbilityType;

public class Warrior extends Hero{
    int baseHealth;
    int baseAttack;

    public Warrior(int health, int attack) {
        super(health, attack, AbilityType.SAVE_DAMAGE_AND_REVERT);
        this.baseAttack=attack;
        this.baseHealth=health;
    }

    @Override
    public void useAbility(Hero[] heroes) {
        if (this.health>0){
            this.attack=this.baseHealth-this.health+this.baseAttack;
        }
    }
}
