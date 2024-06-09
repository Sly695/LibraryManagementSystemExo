public class Newspaper extends Publication implements Borrowable{
    String editor;
    boolean borrowed = false;

    public Newspaper(String title, String publicationDate, String editor, Library library) {
        super(title, publicationDate, library);
        this.editor = editor;
    }

    @Override
    void printDetails() {
        System.out.println(title + " " + publicationDate + " " + editor );
    }

    @Override
    public void borrow() {
        borrowed = false;
        System.out.println("Les journaux ne peuvent être empruntés, désolé.");
    }

    @Override
    public void returnitem() {
        borrowed= false;
    }

    @Override
    public boolean isBorrowed() {
        return this.borrowed;
    }
}
