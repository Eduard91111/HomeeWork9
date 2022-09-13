package HomeeWork10;

public class Book {
    private String NameBook;
    private int yearOfPublication;
    private Author Author;

    public Book(String NameBook, int yearOfPublication, Author Author) {
        this.NameBook = NameBook;
        this.yearOfPublication = yearOfPublication;
        this.Author = new Author("Стивен", "Кинг");
    }
    public String getNameBook() {
        return NameBook;
    }
    public int getYearOfPublication() {return yearOfPublication;}
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String toString() {
        return "Название книги: " + getNameBook() + ";";
    }
    public Book () {
        Book book = new Book("Мобильник", 2009, new Author("Стивен", "Кинг"));
        Book book2 = book;
        System.out.println(book.equals(book2));
    }
    public int hashCode() {
        return java.util.Objects.hash(NameBook);
    }
}
