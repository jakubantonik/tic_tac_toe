package game;


import java.util.Scanner;

public class GameBoard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char[][] array = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                array[i][n] = ' ';
            }
        }
        System.out.println("Witaj w grze");
        char symbol = 'X';

        while (true) {
            GameBoard.getMove(array, symbol);
            GameBoard.getBoard(array);
            boolean winRows = checkingRows(array, symbol);
            boolean winColumns = checkingColumns(array, symbol);
            boolean winSlants = checkingSlants(array, symbol);
            if(winRows || winColumns || winSlants){
                break;
            }
            symbol = (symbol == 'X') ? 'O' : 'X';
        }
    }
    public static void getBoard(char[][] array){
            for (char[] first : array) {
                for (char second : first) {
                    System.out.print("|" + second + "|");
                }
                System.out.println("");
            }
        }
    public static void getMove(char [][] array, char symbol) {
        Scanner scan = new Scanner(System.in);
        boolean correctMove = false;
        int row = 0;
        int column = 0;
        while (!correctMove) {
            System.out.println("Wprowadź dane");
            System.out.println("Podaj wiersz");
            row = scan.nextInt();
            System.out.println("Podaj kolumne");
            column = scan.nextInt();
            correctMove = array[row][column] == ' ' && row <= 2 && column <= 2;
            if(!correctMove){
                System.out.println("Niepoprawne dane");
            }
        }
        array[row][column] = symbol;
        System.out.println("Wprowadzono dane");
    }
    public static boolean checkingRows(char [][] array, char symbol){
        if (array[0][0] == symbol && array[0][1] == symbol && array[0][2] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        if (array[1][0] == symbol && array[1][1] == symbol && array[1][2] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        if (array[2][0] == symbol && array[2][1] == symbol && array[2][2] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        return false;
    }
    public static boolean checkingColumns(char [][] array, char symbol){
        if (array[0][0] == symbol && array[1][0] == symbol && array[2][0] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        if (array[0][1] == symbol && array[1][1] == symbol && array[2][1] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        if (array[0][2] == symbol && array[1][2] == symbol && array[2][2] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        return false;
    }
    public static boolean checkingSlants(char [][] array, char symbol){
        if (array[0][0] == symbol && array[1][1] == symbol && array[2][2] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        if (array[2][0] == symbol && array[1][1] == symbol && array[0][2] == symbol){
            System.out.println("Gracz: " + symbol + " wygrywa!");
            return true;
        }
        return false;
    }
}


