package com.company.taskSolvers;

import com.company.constants.MazeGridConstants;
import com.company.models.Maze;

import java.util.List;
import java.util.Set;

public class LegalMazeSolver implements MazeSolver {
    private static String ILLEGAL_MAZE_OUTPUT = "Invalid maze provided.";
    private static String LEGAL_MAZE_OUTPUT = "Valid maze provided.";
    private Set<Character> legalChars =  Set.of(
            MazeGridConstants.BOUNDARY_CHAR,
            MazeGridConstants.DESTINATION_CHAR,
            MazeGridConstants.NEW_LINE_CHAR,
            MazeGridConstants.OPEN_SPACE_CHAR,
            MazeGridConstants.START_CHAR);

    public String solveMaze(Maze maze) {
        List<String> grid = maze.getGrid();
        int expectedColumnSize = grid.get(0).length(), expectedRowSize = grid.size();
        if (expectedRowSize < 1 || expectedColumnSize < 1) {
            return ILLEGAL_MAZE_OUTPUT;
        }
        int startCount = 0, endCount = 0;
        for (String row : grid) {
            if (row.length() != expectedColumnSize) {
                return ILLEGAL_MAZE_OUTPUT;
            }
            for (char pos : row.toCharArray()) {
                if (!legalChars.contains(pos)) {
                    return ILLEGAL_MAZE_OUTPUT;
                }
                startCount += (pos == MazeGridConstants.START_CHAR) ? 1 : 0;
                endCount += (pos == MazeGridConstants.DESTINATION_CHAR) ? 1 : 0;
            }
        }
        if (startCount != 1 || endCount != 1) {
            return ILLEGAL_MAZE_OUTPUT;
        }
        return LEGAL_MAZE_OUTPUT;
    }
}
