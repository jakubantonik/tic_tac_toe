package game;

import java.util.Random;

import static game.ValidMove.isValidMove;

public class ComputerMove {
    public static void getComputerMove(char[][] array, char symbol ){
        Random r = new Random();
        int row = r.nextInt(3);
        int column = r.nextInt(3);
        while(!isValidMove(array,row,column)){
            row = r.nextInt(3);
            column = r.nextInt(3);
        }
        array[row][column] = symbol;
    }

}
