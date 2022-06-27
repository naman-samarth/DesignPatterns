package structural.adapter;

public class Runner {

    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        hole.fits(roundPeg);


        SquarePeg squarePeg = new SquarePeg(6);
        // Compilation Error
        // hole.fits(squarePeg);

        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        hole.fits(squarePegAdapter);
    }
}
