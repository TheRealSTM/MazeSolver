package com.company.constants;

import lombok.Data;

@Data
public class MazeGridConstants {
    public static char START_CHAR = 'S';
    public static char DESTINATION_CHAR = 'D';
    public static char BOUNDARY_CHAR = '#';
    public static char OPEN_SPACE_CHAR = '.';
    public static char NEW_LINE_CHAR = '\n';
}
