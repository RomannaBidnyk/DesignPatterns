package prototype;

public class Main {

    public static void main(String[] args) {
        Book originalBook = new Book(300, "Harry Potter 1", "Rowling");
        System.out.println(originalBook);

        Book copyBook = (Book) originalBook.copy();
        System.out.println(copyBook);

        BookFactory bookFactory = new BookFactory(copyBook);
        Book secondCopy = bookFactory.makeCopy();
        System.out.println(secondCopy);

        bookFactory.setBook(new Book(400, "Harry Potter 2", "Rowling"));
        Book newBookCopy = bookFactory.makeCopy();
        System.out.println(newBookCopy);

        secondCopy.setPages(5000);
        System.out.println(secondCopy);
        newBookCopy.setPages(1000);
        System.out.println(newBookCopy);
    }
}