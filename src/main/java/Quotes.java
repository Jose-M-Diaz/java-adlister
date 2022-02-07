import java.io.Serializable;

public class Quotes implements Serializable {
    private long id;
    private Author author;
    private String content;

    public Quotes() {
    }

    public Quotes(long id) {
        this.id = id;
    }

    public Quotes(Author author) {
        this.author = author;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public Author getAuthor() {
        return author;
    }

    public long getId() {
        return id;
    }
}
