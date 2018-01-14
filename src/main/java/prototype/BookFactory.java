package prototype;

public class BookFactory {
    Book book;

    public BookFactory(Book book) {
        setBook(book);
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book makeCopy() {
        return (Book) book.copy();
    }
}