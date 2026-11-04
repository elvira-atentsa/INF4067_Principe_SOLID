public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEBUT DES TESTS DU MODULE SRP ===");

        // 1. Création du livre
        BookSRP myBook = new BookSRP(
                "Design Patterns",
                "Erich Gamma",
                "Principes SOLID et patrons de conception.");

        // 2. Test de l'affichage
        BookPrinter printer = new BookPrinter();
        printer.printToScreen(myBook);
        printer.printToHTML(myBook);

        // 3. Test de la persistance
        BookSaver saver = new BookSaver();
        saver.saveToDatabase(myBook);
        saver.saveToFile(myBook, "livre.txt");

        // 4. Test de la logique métier
        BookBusinessLogic logic = new BookBusinessLogic();
        logic.emprunter(myBook, "Marc");
        logic.autreService(myBook);

        System.out.println("\n=== FIN DES TESTS ===");
    }
}