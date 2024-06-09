public abstract class Publication {
    String title;
    String publicationDate;
    static int compteur = 0;

    public Publication(String title, String publicationDate, Library library) {
        this.title = title;
        this.publicationDate = publicationDate;
        compteur++;
        library.addPublication(this);
    }

    abstract void printDetails();

    public String getName() {
        return title;
    }

    static int getNumberPublicationCreated(){
        return compteur;
    }
}
