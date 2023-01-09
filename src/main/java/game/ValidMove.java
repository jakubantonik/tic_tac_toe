package game;

public class ValidMove {
    public static boolean isValidMove(char[][] array, int row, int column){

        return row <=2 && column <=2 && array[row][column] == ' ';
    }
}
