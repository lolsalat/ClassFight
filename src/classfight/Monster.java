package classfight;

public abstract class Monster {

    public String name;
    public int hp;

    public Monster(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public boolean isDead(){
        return hp == 0;
    }

    public void damage(int amount){
       this.hp = Math.max(0, this.hp - amount);
       System.out.printf("[%s][%d] %s%d hp\n", this.name, this.hp, amount < 0 ? "+" : "-", Math.abs(amount));
    }

    public abstract void attack(Monster monster);
}
