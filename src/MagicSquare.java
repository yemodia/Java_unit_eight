/**
 * @author Yerim-Oumar Dia
 * @since 04/08/2020
 */


public class MagicSquare {
    private int[][] grid;

    /**
     * This method initializes a 2D array grid to g
     * @param g
     */

    public MagicSquare(int[][] g) {
        grid = g;
    }


    /**
     * This method returns the sum of the values in a designated row
     * @param row Designated row chosen from 2D array
     * @return
     */

    public int rowSum(int row) {
        // <<< Complete the code >>>


        int total = 0;

        for(int column=0; column<grid[row].length;column++) {
            total+=grid[row][column];
        }
        return total;
    }


    /**
     * This method returns the sum of the values in a designated column
     * @param col Designated column chosen from 2D array
     * @return
     */
    public int colSum(int col) {
        // <<< Complete the code >>>

        int totalCol = 0;

        for(int row=0; row<grid.length;row++) {
            totalCol+=grid[row][col];
        }
        return totalCol;
    }


    /**
     * Starts at bottom left corner and finds the sum diagonally
     * @return an int representing the sum of the diagonal
     */
    public int upDiagSum() {
        // <<< Complete the code >>>
        int total = 0;
        for (int row = 0; row < grid.length; row++) {
            int col = grid.length - row - 1;
            total += grid[row][col];
        }
        return total;
    }


    /**
     * Starts in the top right corner and finds the sum diagonally
     * @return an int representing the sum of the downward diagonal
     */
    public int downDiagSum() {
        // <<< Complete the code >>>
        int total=0;
        for (int row = 0; row < grid.length; row++) {
            total += grid[row][row];
        }
        return total;
    }


    /**
     * This method checks to see if all the sums are the same
     * @return It returns if array is a magic square or not
     */
    public boolean isMagicSquare() {
        // <<< Complete the code >>>
        for(int i = 0; i < grid.length; i++){
            if(rowSum(i) != colSum(i))
                return false;

            else if(rowSum(i) != upDiagSum())
                return false;

            else if(rowSum(i) != downDiagSum())
                return false;
        }
        return true;
    }


    /**
     * This method is complete. You do not need to provide additional
     * comments here.
     */
    public void printGrid() {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[0].length; col++) {
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println("");
        }
    }
}

