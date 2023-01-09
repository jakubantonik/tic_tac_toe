package game;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Board board = new Board();
        System.out.println("Witaj w grze");
        System.out.println("Wybierz wariant gry: \n1 - Gra z kompanem \n2 - Gra z komputerem");
        int version = scan.nextInt();
        System.out.println("Wprowadź ilość wygranych");
        char symbol = 'X';

        while (true) {
            if(version == 1) {
                PlayerMove.getPlayerMove(board.array, symbol);
                board.getBoard();
                if (MoveUtil.checkResult(board.array, symbol)) {
                    break;
                }
                symbol = (symbol == 'X') ? 'O' : 'X';
            } else if (version == 2) {
                PlayerMove.getPlayerMove(board.array, symbol);
                board.getBoard();
                if (MoveUtil.checkResult(board.array, symbol)) {
                    break;
                }
                System.out.println("Ruch komputera: ");
                symbol = (symbol == 'X') ? 'O' : 'X';
                ComputerMove.getComputerMove(board.array, symbol);
                board.getBoard();
                if (MoveUtil.checkResult(board.array, symbol)) {
                    break;
                }
                symbol = (symbol == 'X') ? 'O' : 'X';
            }
        }
    }
}


