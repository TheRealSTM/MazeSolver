package com.company;

import com.company.models.Maze;
import com.company.taskSolvers.LegalMazeSolver;
import com.company.taskSolvers.OptimalSolutionSolver;
import com.company.taskSolvers.SolutionExistsSolver;
import com.company.taskSolvers.TeleportingMazeSolver;
import com.company.utilities.MazeReader;

import java.util.Scanner;

public class Main {
    final static LegalMazeSolver legalMazeSolver = new LegalMazeSolver();
    final static OptimalSolutionSolver optimalSolutionSolver = new OptimalSolutionSolver();
    final static SolutionExistsSolver solutionExistsSolver = new SolutionExistsSolver();
    final static TeleportingMazeSolver teleportingMazeSolver = new TeleportingMazeSolver();

    public static void main(String[] args) {
        String task = args[0];
        if (!isValidTaskProvided(task)) {
            System.out.println("Invalid task provided - task must be an integer between 1 and 4.");
            return;
        }
        Maze maze = MazeReader.readMaze();
        String result = "No solution found.";
        switch (task) {
            case "1":
                System.out.println("Attempting to determine if the maze is legal.");
                result = legalMazeSolver.solveMaze();
                break;
            case "2":
                System.out.println("Attempting to determine if the maze has a solution.");
                result = solutionExistsSolver.solveMaze();
                break;
            case "3":
                System.out.println("Attempting to find the maze has an optimal solution.");
                result = optimalSolutionSolver.solveMaze();
                break;
            case "4":
                System.out.println("Attempting to find the teleporting maze's optimal solution.");
                result = teleportingMazeSolver.solveMaze();
                break;
            default:
                System.out.println("Solver doesn't know how to solve.");
        }
        System.out.println("Result: " + result);

    }

    private static boolean isValidTaskProvided(String task) {
        return task.length() == 1 && task.toCharArray()[0] >= '1' && task.toCharArray()[0] <= '4';
    }
}
