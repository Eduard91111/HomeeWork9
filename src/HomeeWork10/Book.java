package HomeeWork10;

import java.util.Objects;

public class Book {
    private String NameBook;
    private int yearOfPublication;
    private Author author;

    public Book(String NameBook, Author author, int yearOfPublication) {
        this.NameBook = NameBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;

    }
    public String getNameBook() {
        return NameBook;
    }
    public Author getAuthor() {
        return author;
    }
    public int getYearOfPublication() {return yearOfPublication;}
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "NameBook='" + NameBook + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && NameBook.equals(book.NameBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(NameBook, yearOfPublication, author);
    }
}
