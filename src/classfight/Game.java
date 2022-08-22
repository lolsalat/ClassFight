package classfight;

public class Game {
    
    public Monster monster1, monster2;

    public Game(Monster monster1, Monster monster2){
        this.monster1 = monster1;
        this.monster2 = monster2;
    }



    public void run(){

        Monster attacker = monster1;
        Monster target = monster2;
        Monster tmp;

        System.out.printf("%s kämpft gegen %s\n", monster1.name, monster2.name);

        do {
            tmp = target;
            target = attacker;
            attacker = tmp;

            System.out.printf("%s hat %d Leben. Auf in die nächste Runde\n", target.name, target.hp);
            attacker.attack(target);
        } while(!target.isDead());

        System.out.println(attacker.name + " tötet " + target.name);
    }

}
