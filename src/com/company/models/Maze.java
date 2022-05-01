package com.company.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Data
public class Maze {
    private final List<String> grid;

    public void printMaze() {
        if (grid == null) {
            System.out.println("Nothing to print - the maze is null.");
        }
        System.out.println("The current maze is:");
        grid.stream().forEach(System.out::println);
    }
}
