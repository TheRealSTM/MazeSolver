package com.company.utilities;

import com.company.constants.MazeGridConstants;
import com.company.constants.MazeGridDirectionConstants;
import com.company.models.Maze;
import com.company.models.MazePosition;

import java.util.List;

public class MazePositionUtility {
    public static boolean isPositionValid(Maze maze, MazePosition position) {
        List<String> grid = maze.getGrid();
        int rowSize = grid.size(), colSize = grid.get(0).length();
        if (position.getRowPos() < 0 || position.getRowPos() >= rowSize) {
            return false;
        }
        if (position.getColumnPos() < 0 || position.getColumnPos() >= colSize) {
            return false;
        }
        return true;
    }

    public static boolean isPositionTraversable(Maze maze, MazePosition position) {
        if (!isPositionValid(maze, position)) return false;
        List<String> grid = maze.getGrid();
        char mazeCharValue = grid.get(position.getRowPos()).charAt(position.getColumnPos());
        return MazeGridConstants.TRAVERSEABLE_SQUARES.contains(mazeCharValue);
    }
}