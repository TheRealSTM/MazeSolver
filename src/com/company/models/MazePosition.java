package com.company.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class MazePosition {
    private int rowPos;
    private int columnPos;
    private StringBuilder path;

    public MazePosition(int rowPos, int columnPos) {
        this(rowPos, columnPos, new StringBuilder());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MazePosition)) return false;
        MazePosition other = (MazePosition) o;
        if (!other.canEqual((Object)this)) return false;
        if (this.rowPos != other.getRowPos()) return false;
        if (this.columnPos != other.getColumnPos()) return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + this.rowPos;
        result = (result * PRIME) + this.columnPos;
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof MazePosition;
    }

    public void update(MazePosition currentPosition) {
        this.rowPos = currentPosition.getRowPos();
        this.columnPos = currentPosition.getColumnPos();
        this.path = currentPosition.getPath();
    }
}
