package com.company.taskSolvers;

import com.company.constants.MazeGridDirectionConstants;
import com.company.models.Maze;
import com.company.models.MazePosition;
import com.company.models.MazePositionChange;
import com.company.utilities.MazePositionUtility;

import java.util.HashSet;
import java.util.Set;

public class SolutionExistsSolver implements MazeSolver {
    public String solveMaze(Maze maze) {
        MazePosition start = maze.getStartPos(), end = maze.getEndPos();
        Set<MazePosition> visitedPositions = new HashSet<>();
        MazePosition finalPosition = new MazePosition(-1, -1, new StringBuilder());
        searchMaze(maze, start, visitedPositions, finalPosition);
        return "The solution to the maze is: " + (finalPosition.getPath().length() != 0 ? finalPosition.getPath().toString() : "No Solution");
    }

    private void searchMaze(Maze maze, MazePosition currentPosition, Set<MazePosition> visitedPositions, MazePosition result) {
        if (visitedPositions.contains(currentPosition)) {
            return;
        }
        visitedPositions.add(currentPosition);
        if (maze.isEndingPosition(currentPosition)) {
            result.update(currentPosition);
            return;
        }
        for (MazePositionChange positionChange : MazeGridDirectionConstants.getAllDirectionChanges()) {
            MazePosition newPosition = new MazePosition(
                    currentPosition.getRowPos() + positionChange.getRowChange(),
                    currentPosition.getColumnPos() + positionChange.getColChange(),
                    new StringBuilder(currentPosition.getPath()).append(positionChange.getSymbolicRepresentation()));
            if (MazePositionUtility.isPositionTraversable(maze, newPosition) && !visitedPositions.contains(newPosition)) {
                searchMaze(maze, newPosition, visitedPositions, result);
            }
        }
    }
}
