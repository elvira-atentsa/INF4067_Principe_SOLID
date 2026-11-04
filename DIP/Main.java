public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEBUT DES TESTS DIP ===");

        Database database;

        database = new MySQLDatabase();
        OrderProcessor order = new OrderProcessor(database);
        order.processOrder("Données à sauvegarder en MySQL");

        database = new MongoDBDatabase();
        OrderProcessor order1 = new OrderProcessor(database);
        order1.processOrder("Données à sauvegarder en MongoDB");

        System.out.println("=== FIN DES TESTS DIP ===");
    }
}