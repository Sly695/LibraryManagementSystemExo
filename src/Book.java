public class Book extends Publication implements Borrowable{
    String author;
    String isbn;
    boolean borrowed = false;

    public Book(String title, String publicationDate, String author, String isbn, Library library){
        super(title, publicationDate, library);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    void printDetails() {
        System.out.println(title + " " + publicationDate + " " + author + " " + isbn);
    }

    @Override
    public void borrow() {
            borrowed = true;
    }

    @Override
    public void returnitem() {
        this.borrowed= false;
    }

    @Override
    public boolean isBorrowed() {
        return this.borrowed;
    }
}
