package HomeeWork10;

import java.util.Objects;

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
    @Override
    public String toString() {
        return "Author{" +
                "AuthorsName='" + AuthorsName + '\'' +
                ", LastNameOfTheAuthor='" + LastNameOfTheAuthor + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return AuthorsName.equals(author.AuthorsName) && LastNameOfTheAuthor.equals(author.LastNameOfTheAuthor);
    }
    @Override
    public int hashCode() {
        return Objects.hash(AuthorsName, LastNameOfTheAuthor);
    }
}