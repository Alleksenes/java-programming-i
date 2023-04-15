public class Film {
    private String name;
    private int filmAgeRating;

    public Film(String name, int filmAgeRating) {
        this.name = name;
        this.filmAgeRating = filmAgeRating;
    }

    public String name() {
        return name;
    }

    public int ageRating() {
        return filmAgeRating;
    }
}
