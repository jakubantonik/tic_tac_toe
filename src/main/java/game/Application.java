package game;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Board board = new Board();
        System.out.println("Witaj w grze");
        System.out.println("Wybierz wariant gry: \n1 - Gra z kompanem \n2 - Gra z komputerem");
        int version = scan.nextInt();
        System.out.println("Podaj do ilu wygranych ma toczyć się rozgrywka");
        int numbersOfWins = scan.nextInt();
        int wins =0;


        char symbol = 'X';
        boolean win = true;


        do {
            if(version == 1) {
                PlayerMove.getPlayerMove(board.array, symbol);
                board.getBoard();
                if (MoveUtil.checkResult(board.array, symbol, wins, numbersOfWins)) {
                    continue;
                }
                symbol = (symbol == 'X') ? 'O' : 'X';
            } else if (version == 2) {
                PlayerMove.getPlayerMove(board.array, symbol);
                board.getBoard();
                if (MoveUtil.checkResult(board.array, symbol, wins, numbersOfWins)) {
                    continue;
                }
                System.out.println("Ruch komputera: ");
                symbol = 'O';
                ComputerMove.getComputerMove(board.array, symbol);
                board.getBoard();
                if (MoveUtil.checkResult(board.array, symbol, wins, numbersOfWins)) {
                    continue;
                }
                symbol = 'X';
            }
        } while (numbersOfWins > wins);
    }
}


