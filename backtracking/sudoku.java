public class sudoku {

    public static boolean issafe(int sudoku[][], int row, int col, int digit) {

        // 🔽 Check COLUMN
        // Why?
        // A digit must not repeat in the same column.
        // So we scan all rows (0–8) for the same column 'col'
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false; // digit already exists in column
            }
        }

        // 🔽 Check ROW
        // Why?
        // A digit must not repeat in the same row.
        // So we scan all columns (0–8) for the same row 'row'
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false; // digit already exists in row
            }
        }

        // 🔽 Check 3×3 GRID
        // Why?
        // Sudoku has 9 subgrids (3×3), and each digit must be unique inside it.

        // Find starting index of the 3×3 subgrid
        // Example:
        // row=5 → (5/3)*3 = 3 → grid starts at row 3
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        // Now scan the entire 3×3 box
        // i goes from sr → sr+2
        // j goes from sc → sc+2
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {

                if (sudoku[i][j] == digit) {
                    return false; // digit already exists in this 3×3 box
                }
            }
        }

        // If digit not found anywhere → safe to place
        return true;
    }

    public static boolean sudokusolver(int sudoku[][], int row, int col) {

        // 🔽 Base Case
        // Why row == 9?
        // We move row by row.
        // When row becomes 9 → we have filled entire grid successfully
        if (row == 9) {
            return true;
        }

        // 🔽 Compute next cell position
        // Normally we move right (col + 1)
        int nextrow = row, nextcol = col + 1;

        // If we reach end of column → move to next row
        if (col + 1 == 9) {
            nextrow = row + 1;
            nextcol = 0;
        }

        // 🔽 Skip filled cells
        // Why?
        // We only fill cells that are 0 (empty)
        if (sudoku[row][col] != 0) {
            return sudokusolver(sudoku, nextrow, nextcol);
        }

        // 🔽 Try all digits (1–9)
        // Why loop from 1 to 9?
        // These are the only valid Sudoku numbers
        for (int digit = 1; digit <= 9; digit++) {

            // Check if placing digit is valid
            if (issafe(sudoku, row, col, digit)) {

                // Place digit
                sudoku[row][col] = digit;

                // Recurse for next cell
                if (sudokusolver(sudoku, nextrow, nextcol)) {
                    return true; // solution found
                }

                // 🔙 Backtracking
                // Why?
                // If placing this digit leads to dead end,
                // we undo it and try next digit
                sudoku[row][col] = 0;
            }
        }

        // No digit worked → backtrack
        return false;
    }

    public static void print(int sudoku[][]) {

        // Print grid row by row
        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        int[][] sudoku = {
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},

            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},

            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9}
        };

        if (sudokusolver(sudoku, 0, 0)) {
            print(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }
}