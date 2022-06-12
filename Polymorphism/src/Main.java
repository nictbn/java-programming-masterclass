public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5);
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 0:
                return new Jaws();
            case 1:
                return new IndependenceDay();
            case 2:
                return new MazeRunner();
            case 3:
                return new StarWars();
            case 4:
                return new Forgettable();
        }
        return null;
    }
}

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here";
    }
}

class Jaws extends Movie {

    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats lots of peaople";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet Earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try to escape a maze";
    }
}

class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over the universe";
    }
}

class Forgettable extends Movie {

    public Forgettable() {
        super("Forgettable");
    }
}


