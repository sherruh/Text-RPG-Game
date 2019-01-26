package engine;

import boss.Boss;
import heroes.*;

public class RpgGame {

    private Boss boss;
    private Hero[] heroes;

    public void stagamertGame(){
        this.createGameEntity();
        while(!this.isFinish()){
            this.round();
        }

    }

    private void round() {
        this.heroesHit();
        if(this.isFinish()){
            this.showStatistics();
            return;
        }
        this.bossHit();
        this.useSuperAbilities();
        this.showStatistics();

    }

    private void showStatistics() {
        for (Hero hero: this.heroes) {
            System.out.println("Hero " + hero.getClass().getSimpleName() + " current health: " + hero.getHealth());
        }

        System.out.println("Boss health: "+boss.getHealth());
        System.out.println("_______________");
    }

    private void useSuperAbilities() {
        for(Hero hero: this.heroes){
            hero.useAbility(this.heroes);
        }
    }

    private void bossHit() {
        for(Hero hero: this.heroes){
            if(hero.getHealth()>0){
                hero.setHealth(hero.getHealth()-this.boss.getAttack());
            }
        }
    }

    private void heroesHit() {
        for (Hero hero:this.heroes) {
            if(!this.isFinish()){
                this.boss.setHealth(this.boss.getHealth()-hero.getAttack());
            }
        }
    }

    private boolean isFinish() {
        if(this.boss.getHealth()<=0){
            return true;
        }

        boolean allHeroesWasDied=true;

        for(Hero hero: this.heroes){
            if(hero.getHealth()>0){
                return false;
            }
        }

        return allHeroesWasDied;
    }

    private void createGameEntity(){
        this.boss=new Boss(400,33);
        this.heroes=new Hero[]{
                new Medic(100,10),
                new Hunter(100,10),
                new Warrior(100,10),
                new Magical(100,10)};
    }
}
