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
}
