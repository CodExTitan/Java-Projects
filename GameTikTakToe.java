package udemycourseL;

import java.util.Scanner;

public class GameTikTakToe {
    static Scanner Scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Let's play Tic-Tac-Toe game");

        String[][] Board = {
                {"_", "_", "_"},
                {"_", "_", "_"},
                {"_", "_", "_"}
        };

        printBoard(Board);

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("Turn: x");
                int[] spot = askUser(Board);
                Board[spot[0]][spot[1]] = "x";
            } else {
                System.out.println("Turn: o");
                int[] spot = askUser(Board);
                Board[spot[0]][spot[1]] = "o";
            }
            printBoard(Board);

            int count = checkWin(Board);
            if (count == 3) {
                System.out.println("X wins!");
                break;
            } else if (count == -3) {
                System.out.println("O wins!");
                break;
            } else if (i == 8) {
                System.out.println("Draw!");
            }
        }

        Scan.close();
    }

    public static void printBoard(String[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.print("\n\n");
        }
    }

    public static int[] askUser(String[][] Board) {
        System.out.print("Pick a row and column: ");
        int row = Scan.nextInt();
        int element = Scan.nextInt();
        while (!Board[row][element].equals("_")) {
            System.out.print("Spot already occupied!\nTry again: ");
            row = Scan.nextInt();
            element = Scan.nextInt();
        }
        return new int[]{row, element};
    }

    public static int checkWin(String[][] Board) {
        int rows = checkRows(Board);
        if (Math.abs(rows) == 3) return rows;

        int columns = checkColumns(Board);
        if (Math.abs(columns) == 3) return columns;

        int leftDiagonal = checkLeft(Board);
        if (Math.abs(leftDiagonal) == 3) return leftDiagonal;

        int rightDiagonal = checkRight(Board);
        if (Math.abs(rightDiagonal) == 3) return rightDiagonal;

        return 0; // no winner yet
    }

    public static int checkRows(String[][] Board) {
        for (int i = 0; i < Board.length; i++) {
            int count = 0;
            for (int j = 0; j < Board[i].length; j++) {
                if (Board[i][j].equals("x")) {
                    count++;
                } else if (Board[i][j].equals("o")) {
                    count--;
                }
            }
            if (Math.abs(count) == 3) {
                return count;
            }
        }
        return 0;
    }

    public static int checkColumns(String[][] Board) {
        for (int i = 0; i < Board.length; i++) {
            int count = 0;
            for (int j = 0; j < Board[i].length; j++) {
                if (Board[j][i].equals("x")) {
                    count++;
                } else if (Board[j][i].equals("o")) {
                    count--;
                }
            }
            if (Math.abs(count) == 3) {
                return count;
            }
        }
        return 0;
    }

    public static int checkLeft(String[][] Board) {
        int count = 0;
        for (int i = 0; i < Board.length; i++) {
            if (Board[i][i].equals("x")) {
                count++;
            } else if (Board[i][i].equals("o")) {
                count--;
            }
        }
        return count;
    }

    public static int checkRight(String[][] Board) {
        int count = 0;
        for (int i = 0; i < Board.length; i++) {
            if (Board[i][Board.length - i - 1].equals("x")) {
                count++;
            } else if (Board[i][Board.length - i - 1].equals("o")) {
                count--;
            }
        }
        return count;
    }
}
