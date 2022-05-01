package com.company.constants;

import com.company.models.MazePositionChange;

import java.util.List;

public class MazeGridDirectionConstants {
    public final static MazePositionChange UP = new MazePositionChange(0, 1, 'R');
    public final static MazePositionChange DOWN = new MazePositionChange(0, -1, 'L');
    public final static MazePositionChange RIGHT = new MazePositionChange(1, 0, 'U');
    public final static MazePositionChange LEFT = new MazePositionChange(-1, 0, 'D');

    public static List<MazePositionChange> getAllDirectionChanges() {
        return List.of(UP, DOWN, RIGHT, LEFT);
    }
}
