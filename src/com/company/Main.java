package com.company;

import com.company.taskSolvers.LegalMazeSolver;
import com.company.taskSolvers.OptimalSolutionSolver;
import com.company.taskSolvers.SolutionExistsSolver;
import com.company.taskSolvers.TeleportingMazeSolver;

import java.util.Scanner;

public class Main {
    final static LegalMazeSolver legalMazeSolver = new LegalMazeSolver();
    final static OptimalSolutionSolver optimalSolutionSolver = new OptimalSolutionSolver();
    final static SolutionExistsSolver solutionExistsSolver = new SolutionExistsSolver();
    final static TeleportingMazeSolver teleportingMazeSolver = new TeleportingMazeSolver();

    public static void main(String[] args) {

        String task = args[0];
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
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}
