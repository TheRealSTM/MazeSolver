package com.company.constants;

import lombok.Data;

import java.util.Set;

@Data
public class MazeGridConstants {
    public static char START_CHAR = 'S';
    public static char DESTINATION_CHAR = 'D';
    public static char BOUNDARY_CHAR = '#';
    public static char OPEN_SPACE_CHAR = '.';
    public static char NEW_LINE_CHAR = '\n';
    public static Set<Character> TRAVERSEABLE_SQUARES = Set.of(START_CHAR, DESTINATION_CHAR, OPEN_SPACE_CHAR);
}
