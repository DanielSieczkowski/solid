package dependency_inversion;
public class BookService {
    private IsbnGenerator isbn = new IsbnGenerator();

    public Book createBook(String title) {
        return new Book(title, isbn.generateNumber());
    }
}
