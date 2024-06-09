public class Magazine extends Publication implements Borrowable{
    String issueNumber;
    boolean borrowed = false;

    public Magazine(String title, String publicationDate, String issueNumber, Library library) {
        super(title, publicationDate,library);
        this.issueNumber = issueNumber;
    }

    @Override
    void printDetails() {
        System.out.println("1.Title: " + title + " 2.Date de Publication: " + publicationDate + " 3.Issue Number: " + issueNumber );
    }

    @Override
    public void borrow() {
        this.borrowed = true;
    }

    @Override
    public void returnitem() {
        this.borrowed = false;
    }

    @Override
    public boolean isBorrowed() {
        return this.borrowed;
    }
}
