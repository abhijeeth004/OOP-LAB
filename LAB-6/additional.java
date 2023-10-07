a1)class Game {
    void type() {
        System.out.println("Indoor & outdoor games");
    }
}

class Cricket extends Game {
    @Override
    void type() {
        System.out.println("Cricket is an outdoor game");
    }
}

class Chess extends Game {
    @Override
    void type() {
        System.out.println("Chess is an indoor game");
    }
}

public class Main {
    public static void main(String[] args) {
        Game indoorOutdoorGame = new Game();
        Game cricketGame = new Cricket();
        Game chessGame = new Chess();

        // Dynamic method dispatch - calling overridden methods
        indoorOutdoorGame.type();
        cricketGame.type();
        chessGame.type();
    }
}
--------------------------------------------------------------
a2)class Bike {
    int speedlimit = 60;

    void run() {
        System.out.println("Bike speed limit is " + speedlimit + " km/h");
    }
}

class Splendar extends Bike {
    int speedlimit = 80;

    @Override
    void run() {
        System.out.println("Splendar speed limit is " + speedlimit + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Splendar splendar = new Splendar();

        // Achieving runtime polymorphism
        Bike reference1 = bike;
        Bike reference2 = splendar;

        reference1.run(); // Calls the run() method of Bike
        reference2.run(); // Calls the run() method of Splendar
    }
}
