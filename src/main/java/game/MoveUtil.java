package game;

public class MoveUtil {
    public static boolean checkingRows(char [][] array, char symbol){
        for(int n=0; n<3; n++){
            if (array[n][0] == symbol && array[n][1] == symbol && array[n][2] == symbol){
                System.out.println("Gracz: " + symbol + " wygrywa!");
                return true;
            }
        }
        return false;
    }
    public static boolean checkingColumns(char [][] array, char symbol){
        for(int i=0; i<3; i++){
            if (array[0][i] == symbol && array[1][i] == symbol && array[2][i] == symbol){
                System.out.println("Gracz: " + symbol + " wygrywa!");
                return true;
            }
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
    public static boolean checkResult(char [][] array, char symbol){
        boolean winRows = checkingRows(array, symbol);
        boolean winColumns = checkingColumns(array, symbol);
        boolean winSlants = checkingSlants(array, symbol);
        return winRows || winColumns || winSlants;
    }
}
