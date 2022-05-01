package com.company.taskSolvers;

import com.company.constants.MazeGridDirectionConstants;
import com.company.models.Maze;
import com.company.models.MazePosition;
import com.company.models.MazePositionChange;
import com.company.utilities.MazePositionUtility;

import java.util.*;

public class OptimalSolutionSolver implements MazeSolver {
    public String solveMaze(Maze maze) {
        MazePosition start = maze.getStartPos(), end = maze.getEndPos();
        List<MazePosition> validPositions = Arrays.asList(start);
        Set<MazePosition> visitedPositions = new HashSet<>(Arrays.asList(start));
        MazePosition finalPosition = new MazePosition(-1, -1, new StringBuilder());

        searchMaze:
        while (validPositions.size() > 0) {
            List<MazePosition> updatedValidPositions = new ArrayList<>();
            for (MazePosition currentPosition : validPositions) {
                visitedPositions.add(currentPosition);
                if (maze.isEndingPosition(currentPosition)) {
                    finalPosition = currentPosition;
                    break searchMaze;
                }
                for (MazePositionChange positionChange : MazeGridDirectionConstants.getAllDirectionChanges()) {
                    MazePosition newPosition = new MazePosition(
                            currentPosition.getRowPos() + positionChange.getRowChange(),
                            currentPosition.getColumnPos() + positionChange.getColChange(),
                            new StringBuilder(currentPosition.getPath()).append(positionChange.getSymbolicRepresentation()));
                    if (MazePositionUtility.isPositionTraversable(maze, newPosition) && !visitedPositions.contains(newPosition)) {
                        updatedValidPositions.add(newPosition);
                    }
                }
            }
            validPositions = updatedValidPositions;
        }
        return "The solution to the maze is: " + (finalPosition.getPath().length() != 0 ? finalPosition.getPath().toString() : "No Solution");
    }
}
