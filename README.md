# MazeSolver
The project reads in a maze from a text file provided from the command line and outputs a solution to the maze if it exists.

This is based on a basic homework assignment from college.
The requirements slightly differ, but here is the [original implementation](https://pastecode.io/s/m7pfkicd) in C++.

This implementation can perform three operations over the inputted maze:
1. Determine if the maze meets the specified criteria.
1. Determine if there is a path from the start position to the end position.
1. Determine the optimal solution from the start position to the end position.

The primary difference between 2. and 3. is that I used a DFS based approach for 2. and I used a BFS based approach for 3.

Here is a sample input/output:
```$xslt
java Main 3 < ../src/com/company/inputs/testInput.txt
The current maze is:
##############
#............#
#..###.......#
#...S#...D...#
#..###.......#
#............#
##############
Attempting to find the maze has an optimal solution.
Result: The solution to the maze is: LLUURRRRRRRDD
```

This is a basic project to get back into making side projects.
