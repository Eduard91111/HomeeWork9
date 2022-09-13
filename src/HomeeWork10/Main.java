package HomeeWork10;

public class Main {
    public static void main(String[] args) {
        book1 ();
    }
    public static void book1 () {
        Author author = new Author("Стивен", "Кинг");
        Book book = new Book("Мобильник", author, 2009 );
        System.out.println(book);
        System.out.println("Год издательства: " + book.getYearOfPublication () + ";");
        System.out.println(author);
        System.out.println("Фамилия автора: " + author.getLastNameOfTheAuthor() + ";");
    }
    public static void book2 () {
        Author author = new Author("Федор", "Достоевский");
        Book book = new Book("Преступление и наказание", author, 2007);
        System.out.println(book);
        System.out.println("Год издательства: " + book.getYearOfPublication () + ";");
        book.setYearOfPublication(2010);
        System.out.println("Новый год издательства: " + book.getYearOfPublication () + ";");
        System.out.println (author);
        System.out.println("Фамилия автора: " + author.getLastNameOfTheAuthor() + ";");
    }
}
