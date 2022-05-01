package com.company.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
public class Maze {
    private final List<String> grid;
    private final MazePosition startPos;
    private final MazePosition endPos;

    public void printMaze() {
        if (grid == null) {
            System.out.println("Nothing to print - the maze is null.");
        }
        System.out.println("The current maze is:");
        grid.stream().forEach(System.out::println);
    }

    public boolean isEndingPosition(MazePosition currentPosition) {
        return (currentPosition.getRowPos() == endPos.getRowPos() && currentPosition.getColumnPos() == endPos.getColumnPos());
    }
}
