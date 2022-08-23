public class BeanTest {

    public static void main(String[] args) {

        Album firstAlbum = new Album();
        firstAlbum.setArtist("Queen");
        firstAlbum.setGenre("rock");
        firstAlbum.setName("Bohemian Rhapsody");
        firstAlbum.setSales(10000000);
//        firstAlbum.setReleaseDate();

        Author johnGrisham = new Author();
        johnGrisham.setFirstName("John");
        johnGrisham.setLastName("Grisham");
        johnGrisham.setAuthorId(1);

        Quote shakespeare = new Quote();
        shakespeare.setAuthorId(2);
        shakespeare.setQuoteId(1);
        shakespeare.setContent("To be or not to be");

    }
}