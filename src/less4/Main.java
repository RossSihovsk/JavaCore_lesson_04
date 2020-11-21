package less4;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot("Robot","працюю");
        robot.work();

        CoffeRobot cofferobot = new CoffeRobot("CoffeRobot", "варю каву");
        cofferobot.work();

        RobotDancer robotdancer = new RobotDancer("RobotDancer", "танцюю");
        robotdancer.work();

        RobotCoocker robotcoocker = new RobotCoocker("RobootCocker", "готую");
        robotcoocker.work();


        //1.2  Другу частину першого  завдання я не докінця  зрозумів.
        //написав таким чином, але виникає незрозуміла мені на данний момент помилка.

//        Robot [] arr = new Robot[14];
//        for (int i=0; i<10; ++i){
//
//            arr[i+2]= new RobotCoocker("Name","Working");
//            arr[i+3]= new RobotDancer("Name2","Working2");
//            arr[i+4]= new CoffeRobot("Name3","Working3");
//        }
//
//        for (int i=0; i<10; ++i){
//            arr[i].work();
//        }
    }
}
