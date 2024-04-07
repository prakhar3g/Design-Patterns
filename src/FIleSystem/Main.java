package FIleSystem;

public class Main {

    public static void main(String[] args) {
        Directory movieDirectory = new Directory("Movie");
        File avengers = new File("Avengers");
        movieDirectory.add(avengers);

        Directory comedyMovie = new Directory("ComedyMovie");
        File hulchul = new File("Hulchul");
        comedyMovie.add(hulchul);
        movieDirectory.add(comedyMovie);

        movieDirectory.ls();
    }
}
