package game;

public class MoveUtil {
    static Board board = new Board();

    private int wins = 0;
    public static boolean checkingRows(char [][] array, char symbol, int wins, int numberOfWins){
        for(int n=0; n<3; n++){
            if (array[n][0] == symbol && array[n][1] == symbol && array[n][2] == symbol){
                return newWin(symbol, wins, numberOfWins);
            }
        }
        return false;
    }

    public static boolean checkingColumns(char [][] array, char symbol, int wins, int numberOfWins){
        for(int i=0; i<3; i++){
            if (array[0][i] == symbol && array[1][i] == symbol && array[2][i] == symbol){
                return newWin(symbol, wins, numberOfWins);
            }
        }
        return false;
    }
    public static boolean checkingSlants(char [][] array, char symbol, int wins, int numberOfWins){
        if (array[0][0] == symbol && array[1][1] == symbol && array[2][2] == symbol){
            return newWin(symbol, wins, numberOfWins);
        }
        if (array[2][0] == symbol && array[1][1] == symbol && array[0][2] == symbol){
            return newWin(symbol, wins, numberOfWins);
        }
        return false;
    }
    private static boolean newWin (char symbol, int wins, int numberOfWins) {
        wins++;
        System.out.println("Ilość wygranych rund :" + wins);
        if(wins < numberOfWins){
            System.out.println("Rozpoczynamy kolejną rundę!");
        } else {
            System.out.println("Gracz: " + symbol + " wygrywa!");
        }

        return true;
    }
    public static boolean checkResult(char [][] array, char symbol, int wins, int numberOfWins){
        boolean winRows = checkingRows(array, symbol, wins, numberOfWins);
        boolean winColumns = checkingColumns(array, symbol, wins, numberOfWins);
        boolean winSlants = checkingSlants(array, symbol, wins, numberOfWins);
        return winRows || winColumns || winSlants;
    }
}
