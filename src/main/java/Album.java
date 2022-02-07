import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artist;
    private String name;
    private int releaseDate;
    private int sales;
    private String genre;

    public Album() {
    }

    public Album(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public long getSales() {
        return sales;
    }

    public String getGenre() {
        return genre;
    }
}
