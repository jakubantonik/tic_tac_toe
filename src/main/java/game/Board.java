package game;

public class Board {
    public char[][] array = new char[3][3];
    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                array[i][n] = ' ';
            }
        }
    }
    public void getBoard(){
        for (char[] first : array) {
            for (char second : first) {
                System.out.print("|" + second + "|");
            }
            System.out.println("");
        }
    }


}
