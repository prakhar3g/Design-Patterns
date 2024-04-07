package FlyweightDesignPattern.game;

public class DogRobot implements IRobot{
    private String type;
    private Sprites body;

    public DogRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {

    }
}
