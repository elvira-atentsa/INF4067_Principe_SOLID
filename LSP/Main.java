public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEBUT DES TESTS LSP ===");

        Shape square = new Square(3);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println("Square Area : " + square.getArea());
        System.out.println("Rectangle Area : " + rectangle.getArea());

        System.out.println("=== FIN DES TESTS LSP ===");
    }
}