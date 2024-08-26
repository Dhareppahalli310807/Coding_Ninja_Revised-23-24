// Problem statement
// Othello is a board game and you are expected to implement the move function for this game.

// Arguments passed to the function are - a symbol of the player making the move and x y coordinates of the cell at which the player wishes to make the move.

// The move function will be returning a boolean, false - if the move isn't feasible and true - if the move is feasible and this function will also make the move then i.e. make the required changes in the board.

// Detailed explanation ( Input/output format, Notes, Images )
// Input Format :
// Line 1 : Integer n (Total number of moves)
// Line 2 : Player 1 coordinates, x and y (Two integers separated by space)
// Line 3 : Player 2 coordinates, x and y (Two integers separated by space)
// Note 1 : Number of moves (i.e. n) is always even and Player 1 always starts the game. Note 2 : If any player's coordinates are not valid, enter again till the right move. Main function is given for you reference.
// Sample Input :
// 2
// 2 4
// 1 5
// 2 5
// Sample Output :
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 1 0 0 0 
// 0 0 0 1 1 0 0 0 
// 0 0 0 2 1 0 0 0 
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 0 0 
// false
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 1 2 0 0 
// 0 0 0 1 2 0 0 0 
// 0 0 0 2 1 0 0 0 
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 0 0 
// 0 0 0 0 0 0 0 0

public class OthelloBoard {

    private int board[][];
    final static int player1Symbol = 1;
    final static int player2Symbol = 2;

    public OthelloBoard() {
        board = new int[8][8];
        board[3][3] = player1Symbol;
        board[3][4] = player2Symbol;
        board[4][3] = player2Symbol;
        board[4][4] = player1Symbol;
    }

    public void print() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean move(int symbol, int x, int y) {
        if (!isValidMove(symbol, x, y)) {
            return false;
        }

        board[x][y] = symbol;
        flipCapturedPieces(symbol, x, y);
        return true;
    }

    private boolean isValidMove(int symbol, int x, int y) {
        if (x < 0 || x >= 8 || y < 0 || y >= 8 || board[x][y] != 0) {
            return false;
        }

        int opponentSymbol = (symbol == player1Symbol) ? player2Symbol : player1Symbol;

        boolean valid = false;
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) continue;

                int nx = x + dx;
                int ny = y + dy;
                boolean hasOpponent = false;

                while (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                    if (board[nx][ny] == opponentSymbol) {
                        hasOpponent = true;
                    } else if (board[nx][ny] == symbol) {
                        if (hasOpponent) {
                            valid = true;
                        }
                        break;
                    } else {
                        break;
                    }
                    nx += dx;
                    ny += dy;
                }
            }
        }
        return valid;
    }

    private void flipCapturedPieces(int symbol, int x, int y) {
        int opponentSymbol = (symbol == player1Symbol) ? player2Symbol : player1Symbol;

        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                if (dx == 0 && dy == 0) continue;

                int nx = x + dx;
                int ny = y + dy;
                boolean hasOpponent = false;

                while (nx >= 0 && nx < 8 && ny >= 0 && ny < 8) {
                    if (board[nx][ny] == opponentSymbol) {
                        hasOpponent = true;
                    } else if (board[nx][ny] == symbol) {
                        if (hasOpponent) {
                            flipDirection(symbol, x, y, dx, dy);
                        }
                        break;
                    } else {
                        break;
                    }
                    nx += dx;
                    ny += dy;
                }
            }
        }
    }

    private void flipDirection(int symbol, int x, int y, int dx, int dy) {
        int nx = x + dx;
        int ny = y + dy;

        while (board[nx][ny] != symbol) {
            board[nx][ny] = symbol;
            nx += dx;
            ny += dy;
        }
    }
}
