package classfight;

public class Main {

    public static void main(String [] args){
        Monster golem = new Golem();
        Monster schaf = new Schaf();

        Game game = new Game(golem, schaf);
        game.run();
    }

}