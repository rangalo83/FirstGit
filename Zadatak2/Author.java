package Zadatak2;

public class Author {

    //Svaki autor je opisan imenom, prezimenom i nazivom izdavačke kuće.

    private String authorFirstName;
    private String authorLasyName;
    private String publisher;

    public Author(){

    }

    public Author(String authorFirstName, String authorLasyName, String publisher) {
        this.authorFirstName = authorFirstName;
        this.authorLasyName = authorLasyName;
        this.publisher = publisher;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public String getAuthorLasyName() {
        return authorLasyName;
    }

    public void setAuthorLasyName(String authorLasyName) {
        this.authorLasyName = authorLasyName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
