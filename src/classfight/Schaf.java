package classfight;

import java.util.Random;

public class Schaf extends Monster {

    public Schaf() {
        super("Schaf", 5);
    }

    @Override
    public void attack(Monster monster) {
        monster.damage(new Random().nextInt(3) + 1);
    }
    
}
