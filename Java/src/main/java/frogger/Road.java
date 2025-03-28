package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(int length) {
        this.occupied = new boolean[length];
    }

    public boolean isPositionOccupied(int position) {
        return position >= 0 && position < occupied.length && occupied[position];
    }

    public boolean isValidPosition(int position) {
        return position >= 0 && position < occupied.length;
    }
}
