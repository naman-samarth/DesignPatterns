package structural.adapter.square;

/**
 * SquarePegs are not compatible with RoundHoles. But we have to integrate them
 * into our program.
 */
public class SquarePeg {
    private final double side;

    public SquarePeg(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}
