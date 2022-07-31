package structural.adapter;

import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

/**
 * Adapter allows fitting square pegs into round holes
 */
public class SquarePegAdapter extends RoundPeg {

    private final SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow(squarePeg.getSide() / 2, 2) * 2);
    }
}
