public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

//        Adventure jaws = (Adventure) Movie.getMovie("C", "Jaws"); THIS GENERATES A CLASS CAST EXCEPTION
//        jaws.watchMovie();

//        Object comedy = Movie.getMovie("C", "Airplane");
//        comedy.watchMovie(); OBJECT IS NOT A MOVIE

//        Object comedy = Movie.getMovie("C", "Airplane");
//        Movie comedyMovie = (Comedy) comedy;
//        comedyMovie.watchMovie(); THIS IS OK

//        Object comedy = Movie.getMovie("C", "Airplane");
//        Movie comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy(); This is not ok because Movie is not aware of the watchComedy method

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
