package com.company.utilities;

import com.company.constants.MazeGridConstants;
import com.company.models.Maze;
import com.company.models.MazePosition;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MazeReader {
    public static Maze readMaze() {
        List<String> layout = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int rowPos = 0;
        MazePosition startPos = new MazePosition(-1, -1), endPos = new MazePosition(-1, -1);
        while (scanner.hasNext()) {
            String row = scanner.nextLine();
            layout.add(row);
            int[] potentialStartEnd = getStartOrEnd(row);
            if (potentialStartEnd[0] != -1) {
                startPos = new MazePosition(rowPos, potentialStartEnd[0]);
            }
            if (potentialStartEnd[1] != -1) {
                endPos = new MazePosition(rowPos, potentialStartEnd[1]);
            }
            rowPos++;
        }
        scanner.close();
        return new Maze(layout, startPos, endPos);
    }

    private static int[] getStartOrEnd(String row) {
        char[] rowInCharForm = row.toCharArray();
        int[] startEndColPos = new int[] {-1, -1};
        for (int pos = 0; pos < rowInCharForm.length; pos++) {
            if (rowInCharForm[pos] == MazeGridConstants.START_CHAR) {
                startEndColPos[0] = pos;
            } else if (rowInCharForm[pos] == MazeGridConstants.DESTINATION_CHAR) {
                startEndColPos[1] = pos;
            }
        }
        return startEndColPos;
    }
}
