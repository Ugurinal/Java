/**
 * Created by UGURINAL
 * on 8/17/2019
 * at 8:06 PM
 * Polymorphism
 */


class Movie{
    private String name;

    public Movie(String name){
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName(){
        return name;
    }
}

class Jaws extends Movie{
    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people...";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }
    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze runner");
    }
    @Override
    public String plot(){
        return "Kids try to escape from a maze";
    }
}

class StarWars extends Movie{
    public StarWars(){
        super("StarWars");
    }
    @Override
    public String plot(){
        return "Imperial forces try to take over the universe";
    }
}

class Forgettable extends Movie{
    public Forgettable(){
        super("Forgettable");
    }
    //No plot method
}


public class Main {
    public static void main(String[] args) {

        for(int i = 1; i < 10 ; i++){
            Movie theMovie = randomMovie();
            System.out.println("Movie #"+i+" "+theMovie.getName()+"\n"+"Plot: "+theMovie.plot()+"\n");
        }

    }

    private static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) + 1;   // Math.random() generates random double between 0 - 1...
        System.out.println("Random number generated was " +randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable();
            default:
                return new Movie("Unknown");
        }
    }
}
