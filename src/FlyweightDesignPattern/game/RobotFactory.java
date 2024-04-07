package FlyweightDesignPattern.game;

import java.util.HashMap;
import java.util.Map;

public class RobotFactory {
    static Map<String,IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType){
        if (roboticObjectCache.containsKey(robotType)) {
            return roboticObjectCache.get(robotType);
        }
        else {
            if (robotType.equals("HUMANOID")) {
                Sprites humanoidSprite = new Sprites();
                HumanoidRobot humanoidRobot = new HumanoidRobot(robotType,humanoidSprite);
                roboticObjectCache.put(robotType, humanoidRobot);
                return humanoidRobot;
            }
            else {
                Sprites dogSprite = new Sprites();
                DogRobot dogRobot = new DogRobot(robotType,dogSprite);
                roboticObjectCache.put(robotType, dogRobot);
                return dogRobot;
            }
        }
    }
}
