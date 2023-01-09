package game;

import java.util.Scanner;

import static game.ValidMove.isValidMove;

public class PlayerMove {
    public static void getPlayerMove(char[][] array, char symbol){
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj indeks wiersza");
        int row = scan.nextInt();
        System.out.println("Podaj indeks kolumny");
        int column = scan.nextInt();
        while(!isValidMove(array,row,column)){
            System.out.println("Niepoprawne dane");
            System.out.println("Podaj indeks wiersza");
            row = scan.nextInt();
            System.out.println("Podaj indeks kolumny");
            column = scan.nextInt();

        }
        array[row][column] = symbol;
        System.out.println("Twój ruch: ");
    }


}

