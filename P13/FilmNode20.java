package P13;

public class FilmNode20 {
    int id;
    String title;
    double rating;
    FilmNode20 next;
    FilmNode20 prev;

    public FilmNode20(FilmNode20 prev, int id, String title, double rating, FilmNode20 next) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.next = next;
        this.prev = prev;
    }
}
