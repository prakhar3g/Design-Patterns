package FlyweightDesignPattern.game;

public class HumanoidRobot implements IRobot{
    private String type;
    private Sprites body;

    public HumanoidRobot(String type, Sprites body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {

    }
}
