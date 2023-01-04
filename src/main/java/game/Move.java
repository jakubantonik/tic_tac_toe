package game;

import java.util.Scanner;

public class Move {
    public static void getMove(char[][] array, char symbol){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj indeks wiersza");
        int row = scan.nextInt();
        System.out.println("Podaj indeks kolumny");
        int column = scan.nextInt();
        while(!isValidMove(array, row,column)){
            System.out.println("Niepoprawne dane");
            System.out.println("Podaj indeks wiersza");
            row = scan.nextInt();
            System.out.println("Podaj indeks kolumny");
            column = scan.nextInt();

        }
        array[row][column] = symbol;
        System.out.println("Wprowadzono dane");
    }

    private static boolean isValidMove(char[][] array, int row, int column){

        return row <=2 && column <=2 && array[row][column] == ' ';
    }
}

