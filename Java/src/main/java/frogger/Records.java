package frogger;

import java.util.HashSet;
import java.util.Set;

public class Records {
    private final Set<FroggerID> records;

    public Records() {
        this.records = new HashSet<>();
    }

    public boolean addRecord(FroggerID froggerID) {
        return records.add(froggerID);
    }
}
