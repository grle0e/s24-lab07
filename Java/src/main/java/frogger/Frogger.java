package frogger;

public class Frogger {
    private final Road road;
    private int position;
    private final FroggerID froggerID;

    public Frogger(Road road, int position, FroggerID froggerID) {
        this.road = road;
        this.position = position;
        this.froggerID = froggerID;
    }

    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValidPosition(nextPosition) || road.isPositionOccupied(nextPosition)) {
            return true;
        }
        this.position = nextPosition;
        return true;
    }

    public boolean recordMyself(Records records) {
        return records.addRecord(froggerID);
    }
}
