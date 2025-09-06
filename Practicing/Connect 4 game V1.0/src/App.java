import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        char[][] board = new char[6][7];
        char result;
        int playerMove;
        int playerTurn = 1;
        boolean success;

        Scanner input = new Scanner(System.in);
        resetBoard(board);
        System.out.println("Welcome to Connect Four!");
        System.out.println("To win, connect four of your pieces in a row — vertically, horizontally, or diagonally.");
        System.out.println("Players take turns dropping pieces into one of the columns.");
        while (true) {
            System.out.println((playerTurn % 2 != 0) ? "It's player 1 turn (Red)" : "It's player 2 turn (Blue)");
            displayBoard(board);
            do {
                System.out.print("Please enter column (0-6): ");
                playerMove = input.nextInt();
                if (playerMove < 0 || playerMove > 6) {
                    System.out.println("Invalid column. Try again.");
                    success = false;
                } else {
                    success = putPiece(board, playerTurn % 2 != 0, playerMove);
                    if (!success) {
                        System.out.println("Column is full. Try another.");
                    }
                }
            } while (!success);
            result = checkWin(board);
            if (result == 'R') {
                displayBoard(board);
                System.out.println("Player 1 has won (Red)!");
                break;
            } else if (result == 'B') {
                displayBoard(board);
                System.out.println("Player 2 has won (Blue)!");
                break;
            } else if (result == 'D') {
                displayBoard(board);
                System.out.println("It's a draw!");
                break;
            }
            playerTurn++;
            System.out.println("==================================================");
        }

    }

    public static boolean putPiece(char[][] board, boolean playerTurn, int playerMove) {
        for (int i = board.length - 1; i >= 0; i--) {
            if (board[i][playerMove] == ' ') {
                board[i][playerMove] = playerTurn ? 'R' : 'B';
                return true;
            }
        }
        return false;
    }

    public static void resetBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static char checkWin(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        boolean hasEmpty = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                char piece = board[i][j];
                if (piece == ' ') {
                    hasEmpty = true;
                    continue;
                }
                if (i + 3 < rows &&
                        board[i + 1][j] == piece &&
                        board[i + 2][j] == piece &&
                        board[i + 3][j] == piece) {
                    return piece;
                }
                if (j + 3 < cols &&
                        board[i][j + 1] == piece &&
                        board[i][j + 2] == piece &&
                        board[i][j + 3] == piece) {
                    return piece;
                }
                if (i + 3 < rows && j + 3 < cols &&
                        board[i + 1][j + 1] == piece &&
                        board[i + 2][j + 2] == piece &&
                        board[i + 3][j + 3] == piece) {
                    return piece;
                }
                if (i + 3 < rows && j - 3 >= 0 &&
                        board[i + 1][j - 1] == piece &&
                        board[i + 2][j - 2] == piece &&
                        board[i + 3][j - 3] == piece) {
                    return piece;
                }
            }
        }

        return hasEmpty ? 'N' : 'D';
    }

    public static void displayBoard(char[][] board) {
        System.out.print(" ");
        for (int j = 0; j < board[0].length; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                System.out.print("|");
            }
            System.out.println();
        }
    }

}
