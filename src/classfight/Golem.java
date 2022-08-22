package classfight;

import java.util.Random;

public class Golem extends Monster {

    public Golem() {
        super("Golem", 10);
    }

    @Override
    public void attack(Monster monster) {
        // 1 schaden am Gegner machen
        monster.damage(1);
        // zu 5% um 1 HP heilen
        if(new Random().nextInt(100) < 50){
            this.damage(-1);
        }
    }
    
}
