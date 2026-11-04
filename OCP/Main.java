public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEBUT DES TESTS OCP ===");

        // Test avec un Rectangle
        Shape rect = new Rectangle(4, 3);
        AreaCalculator2 calculator = new AreaCalculator2();
        System.out.println("Aire du Rectangle = " + calculator.calculateArea(rect));

        // Test avec un Cercle
        Shape circle = new Circle(5);
        System.out.println("Aire du Cercle = " + calculator.calculateArea(circle));

        System.out.println("=== FIN DES TESTS OCP ===");
    }
}