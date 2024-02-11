public class KnightTour {
    private static int N = 8;
    // setting squares available for Knight.
    private static boolean isValid (int x, int y, int[][] board) {
        return (x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1);
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static boolean knightsTour () {
        int[][] board = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }
        board[0][0] = 0;
       
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2};
        int[] yMove = {-1, -2, -2, -1, 1, 2, 2, 1};
      
        if (!tourUtility(0, 0, 1, board, xMove, yMove)) {
            System.out.println("No solutions");
            return false;
        }
        else {
            printBoard(board);
            return true;
        }

    }

    private static boolean tourUtility(int x, int y, int move, int[][] board, int[] xMove, int[] yMove) {
        if (move == N * N) {
            return true;
        }

        int next_x, next_y;

        for (int k = 0; k < N; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (isValid(next_x, next_y, board)) {
                board[next_x][next_y] = move;
                if (tourUtility(next_x, next_y, move+1, board, xMove, yMove)) {
                    return true;
                } else {

                    board[next_x][next_y] = -1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        knightsTour();
    }
}