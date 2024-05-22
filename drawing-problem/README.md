# Drawing Problem
Please implement a simple text (ASCII) based drawing program (something similar to a simplified version of Paint). The basic program should allow users to:
1.  Create a new canvas
2.  Draw on the canvas using text based commands
3.  Quit the program
    Your solution should run 'out of the box' and interactively (i.e. it should respond to commands entered manually, see below). If you want to share comments or instructions, please include them in a `README`.
## Commands
|Example|Description |
|--|--|
| `C w h` | Create a new canvas of width w and height h |
| `L x1 y1 x2 y2` | Draw a new line from coordinates  `(x1, y1)`  to  `(x2, y2)` horizontally or vertically. Lines are made up of the  `x`  character |
| `R x1 y1 x2 y2` | Draw a new rectangle, with upper left corner at coordinate  `(x1, y1)`  and lower right coordinate at  `(x2, y2)`. Lines are made up of the  `x`  character |
| `Q` | Quit the program |
## Examples
A sample run of the program is show below. The user input is prefixed with `enter command:`

    enter command: C 20 5
    ----------------------
    |                    |
    |                    |
    |                    |
    |                    |
    |                    |
    ----------------------
    
    enter command: L 1 3 7 3
    ----------------------
    |                    |
    |                    |
    |xxxxxxx             |
    |                    |
    |                    |
    ----------------------
     
    enter command: L 7 1 7 3
    ----------------------
    |      x             |
    |      x             |
    |xxxxxxx             |
    |                    |
    |                    |
    ----------------------
     
    enter command: R 15 2 20 5
    ----------------------
    |      x             |
    |      x       xxxxxx|
    |xxxxxxx       x    x|
    |              x    x|
    |              xxxxxx|
    ----------------------
      
    enter command: Q
