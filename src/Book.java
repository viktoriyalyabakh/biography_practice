public class Book {

    /**
     * COMPLETE THIS CLASS FIRST, THEN CONTINUE WITH AUTHOR AND BIOGRAPHY
    Create a custom constructor that will take 3 args and defines the Book object
    Define Book class fields as name, genre, totalPage
     */

    //Create 3 args custom constructor here
    //YOUR CODE HERE

    public Book(String name, String genre, String totalPage) {
        this.name = name;
        this.genre = genre;
        this.totalPage = totalPage;
    }

    //Define instance variables here
    //YOUR CODE HERE

    public String name;
    public String genre;
    public String totalPage;

    public static Book getBook() {
        String askBookName = ScannerHelper.getQuestionStirng(Queations.askBookName);
        String askBookGenre = ScannerHelper.getQuestionStirng(Queations.askBookGanre);
        String askBookPages = ScannerHelper.getQuestionInt(Queations.askHowManyPages);

        return new Book(askBookName,askBookGenre,askBookPages);
    }


    /*
        Override toString() method that returns Book object information
     */
    //YOUR CODE HERE


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", totalPage=" + totalPage +
                '}';
    }
}
