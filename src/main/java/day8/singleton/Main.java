package day8.singleton;

public class Main {
    public static void main(String[] args) {
        IRobotsFactory iRobotsFactory = new IRobotsFactory(new ObjectFactory());
        IRobot iRobot = iRobotsFactory.createIRobot(IRobot.class);
        iRobot.cleanRoom();
    }
}
