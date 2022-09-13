package HomeeWork10;

public class Author {

    private String AuthorsName;
    private String LastNameOfTheAuthor;

    public Author(String AuthorsName, String LastNameOfTheAuthor) {
        this.AuthorsName = AuthorsName;
        this.LastNameOfTheAuthor = LastNameOfTheAuthor;
    }
    public String getAuthorsName() {
        return AuthorsName;
    }
    public String getLastNameOfTheAuthor() {
        return LastNameOfTheAuthor;
    }
    public String toString() {
        return "Имя автора: " + getAuthorsName() + ";";
    }
    public Author () {
        Author author = new Author("Стивен", "Кинг");;
        Author author2 = author;
        System.out.println(author.equals(author2));
    }
    public int hashCode() {
        return java.util.Objects.hash(AuthorsName);
    }
}