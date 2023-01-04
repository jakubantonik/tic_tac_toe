package game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Board board = new Board();
        Move move = new Move();
        System.out.println("Witaj w grze");
        char symbol = 'X';

        while (true) {
            move.getMove(board.array, symbol);
            board.getBoard();
            if(MoveUtil.checkResult(board.array, symbol)){
                break;
            }
            symbol = (symbol == 'X') ? 'O' : 'X';
        }
    }
}


