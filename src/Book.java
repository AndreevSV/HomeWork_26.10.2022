import java.util.Objects;

public class Book {
    private final String bookName; // Инициализируем переменную названия кники
    private int publicationYear; //Инициализируем переменную года публикации
    Author author;

    public Book(String bookName, int publicationYear, Author author) {
        this.bookName = bookName;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public String getBookName() { // Устаналиваем геттер на название книги
        return bookName;
    }

    public void setPublicationYear(int publicationYear) { // Устанавливаем сеттер на дату публикации
        this.publicationYear = publicationYear;
    }

    public int getPublicationYear() { // Устанавливаем геттер на дату публикации
        return publicationYear;
    }

    @Override
    public String toString() {
        return bookName + " " + publicationYear;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        Book book = (Book) other;
        return publicationYear == book.publicationYear && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, publicationYear, author);
    }
}
