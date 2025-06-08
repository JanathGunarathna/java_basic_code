package game;

public abstract  class GameObjective {
    private int x;
    public void blah(){

    }
    // this method must be implemented by any class that extends GameObjective
    public abstract void draw();


    public static void main(String[] args) {
        //GameObjective myObject = new GameObjective();
        Player player = new Player();
        player.someMethod();
        //player.draw();

        GameObjective menu = new Menu();
        //menu.draw();

        GameObjective[] gameObjective = new GameObjective[2];
        gameObjective[0] = player;
        gameObjective[1]=menu;

        for (GameObjective obj : gameObjective) {
            obj.draw();
            
        }

        //abstract classes exist to be extended, they can not be instantiated

    }
}
