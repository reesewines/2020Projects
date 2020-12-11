import java.util.ArrayList;
import java.util.Scanner;

public class Board {
    public static int row, col;
    public static Scanner scan = new Scanner(System.in);
    public static String[][] board = new String[5][5];
    public static boolean turn = false;
    public static ArrayList<String> characterList = new ArrayList<String>();

    public static void main(String[] args) {
        printBoard();
    }

    public static void printBoard() {

        characterList.add("Admiral Ackbar    ");
        characterList.add("Admiral Holdo     ");
        characterList.add("Admiral Piett     ");
        characterList.add("Ahsoka Tano       ");
        characterList.add("BB-8              ");
        characterList.add("Biggs Darklighter ");
        characterList.add("Boba Fett         ");
        characterList.add("Bossk             ");
        characterList.add("C-3PO             ");
        characterList.add("Chewbacca         ");
        characterList.add("Chirrut Imwe      ");
        characterList.add("Count Dooku       ");
        characterList.add("Darth Maul        ");
        characterList.add("Darth Vader       ");
        characterList.add("Dengar            ");
        characterList.add("Droideka          ");
        characterList.add("Emperor Palpatine ");
        characterList.add("Enfys Nest        ");
        characterList.add("Ezra Bridger      ");
        characterList.add("Finn              ");
        characterList.add("General Grievous  ");
        characterList.add("Grand Moff Tarkin ");
        characterList.add("Greedo            ");
        characterList.add("Han Solo          ");
        int k = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("");
            for (int j = 0; j < 5; j++) {
                board[i][j] = characterList.get(k);
                System.out.print("|" + board[i][j]);
                if (k <= 22) {
                    k++;
                }
            }
            System.out.print("|");

        }
        System.out.println("");
        System.out.println("");
        System.out.println("What would you like to ask about the character?");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(input);
        if (true) {
            System.out.println("Yes");
        }

    }
}
