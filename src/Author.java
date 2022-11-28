import java.util.ArrayList;

public class Author {

    /**
     * WORK ON BOOK CLASS FIRST
     Create a custom constructor that will take 6 args and defines the Author object
     Define Author class fields as firstName, lastName, country, isAlive, age, list of books
     */

    //Create 6 args custom constructor here
    //YOUR CODE HERE

    public Author(String firstName, String lastName, String country, boolean isAlive, ArrayList<Book> listOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.isAlive = isAlive;
        this.listOfBooks = listOfBooks;
    }
    public Author(String firstName, String lastName, String country, boolean isAlive, String age, ArrayList<Book> listOfBooks){
        this(firstName, lastName, country, isAlive,listOfBooks);
        this.age = age;
    }
    /*
        Define instance variables here
        NOTE: Books must be defined as a List of Objects of Book class not String
    */
    //YOUR CODE HERE
    public String firstName;
    public String lastName;
    public String country;
    public boolean isAlive;
    public String age;
    public ArrayList<Book> listOfBooks;

    public static Author createAuthor(){
        String firstName = ScannerHelper.getQuestionStirng(Queations.askAuthorFirstName);
        String lastName = ScannerHelper.getQuestionStirng(Queations.askAuthorLastName);
        String country = ScannerHelper.getQuestionStirng(Queations.askAuthorFrom);
        String isAlive = ScannerHelper.getQuestionStirng(Queations.askIsAlive);

        ArrayList<Book> books = new ArrayList<>();

        do{
            String firstBook = ScannerHelper.getQuestionStirng(Queations.askBookInformation);
            if(firstBook.toLowerCase().startsWith("n")) break;
            books.add(Book.getBook());
        }while(true);

        boolean stillAlive = false;

        if(Queations.askIsAlive.toLowerCase().startsWith("n")) {
            stillAlive = true;
            String age = ScannerHelper.getQuestionInt(Queations.askHowOldAuthor);
            return new Author(firstName, lastName, country, stillAlive, age, books);
        }
        else {
            return new Author(firstName, lastName, country, stillAlive, books);
        }

    }

    /*
    Override toString() method here that returns Author object information
     */
    //YOUR CODE HERE

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", isAlive=" + isAlive +
                ", age=" + age +
                '}';
    }
}
