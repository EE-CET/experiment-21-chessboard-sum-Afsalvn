
import java.util.Scanner;

public class ChessboardSum {

    // Task: Find the sum of black and white squares
    public void calculateSums(int[][] board, int n) {
        // Using long to prevent integer overflow on large matrices
        long blackSum = 0;
        long whiteSum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // If the sum of indices is even, it's a Black square
                if ((i + j) % 2 == 0) {
                    blackSum += board[i][j];
                } 
                // If the sum of indices is odd, it's a White square
                else {
                    whiteSum += board[i][j];
                }
            }
        }

        // Print outputs exactly as requested
        System.out.println(blackSum);
        System.out.println(whiteSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read matrix size N
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[][] board = new int[n][n];
            
            // Read matrix elements
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    board[i][j] = sc.nextInt();
                }
            }
            
            ChessboardSum solver = new ChessboardSum();
            solver.calculateSums(board, n);
        }
        
        sc.close();
    }
}
