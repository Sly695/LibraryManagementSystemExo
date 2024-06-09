public class Main {
    public static void main(String[] args) {

        // Create Library
        Library bibliotheque = new Library();
        // Create publication
        Book harryPotter = new Book("Harry Potter", "12 mai 1894", "JK Rowling", "1234", bibliotheque);
        Book pachinko = new Book("Pachinko", "12 juin 2018", "Min Jin Lee", "4444", bibliotheque);
        Newspaper leMonde = new Newspaper("Le Monde", "22 septembre 1911", "Le monde world", bibliotheque);
        Magazine cosmopolitan = new Magazine("Cosmopolitan", "2 septembre 1969", "Cosmos", bibliotheque);
        //
        cosmopolitan.printDetails();


        // Create Member
        Member jean = new Member("Jean", 1, bibliotheque);
        Member sandara = new Member("Sandara", 2, bibliotheque);
        Member polo = new Member("Polo", 3, bibliotheque);

        //
        jean.borrowItems(pachinko);
        sandara.borrowItems(pachinko);
        sandara.borrowItems(leMonde);
        sandara.borrowItems(harryPotter);
        jean.borrowItems(harryPotter);
        sandara.returnItem(harryPotter);

        System.out.println("Liste de publications empruntés par " + jean.name + " :" + jean.printBorrowedItems());
        System.out.println("Liste de publications empruntés par " + sandara.name + " :" + sandara.printBorrowedItems());

        System.out.println("Il y a " + Publication.getNumberPublicationCreated() + " publications crées depuis.");
        System.out.println("Voici la liste de publication de la librairie: " + bibliotheque.printCatalog());
        System.out.println("Voici la liste des membres dans la librairie: " + bibliotheque.printMembers());

    }
}