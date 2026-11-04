public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEBUT DES TESTS ISP ===");

        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();

        RobotWorker robot = new RobotWorker();
        robot.work();

        System.out.println("=== FIN DES TESTS ISP ===");
    }
}