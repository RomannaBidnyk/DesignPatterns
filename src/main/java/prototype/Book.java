package prototype;

public class Book implements Copyable {

    int pages;
    String name;
    String author;

    public Book(int pages, String name, String author) {
        this.pages = pages;
        this.name = name;
        this.author = author;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public Object copy() {
        Book copy = new Book(pages, name, author);
        return copy;
    }
}