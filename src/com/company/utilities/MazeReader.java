package com.company.utilities;

import com.company.models.Maze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MazeReader {
    public static Maze readMaze() {
        List<String> layout = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            layout.add(scanner.nextLine());
        }
        scanner.close();
        return new Maze(layout);
    }
}
