public class ScienceFiction extends  Movie {
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliens Do Bad Stuff",
                "Space Guys Chase Aliens",
                "Planet Blows Up");
    }
}
