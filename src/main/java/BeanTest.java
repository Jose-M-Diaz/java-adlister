public class BeanTest {
    public static void main(String[] args) {
        Album album = new Album();
        album.setId(1);
        album.setArtist("dance gavin dance");
        album.setName("afterburner");
        album.setReleaseDate(2020);
        album.setSales(23);
        album.setGenre("post-hardcore");
        System.out.println(album.getId());
        System.out.println(album.getArtist());
        System.out.println(album.getName());
        System.out.println(album.getReleaseDate());
        System.out.println(album.getSales());
        System.out.println(album.getGenre());

    }
}
