package sopa;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        FieldCreator fieldCreator = new FieldCreator();
        GameFieldService gameFieldService = new GameFieldService(fieldCreator.fromString(new String[]{  "nnnnn",
                                                                                                        "smacn",
                                                                                                        "nninn",
                                                                                                        "nnfnn"}));
        GameField randGameField = fieldCreator.generateSolvedField(6,6);
        GameFieldService gameFieldService1 = new GameFieldService(randGameField);
        System.out.println(gameFieldService1.solvedPuzzle());
        gameFieldService1.printField();
        gameFieldService1.printFieldWay();
        gameFieldService1.printBacktracking();
/*        int i = 113;
        while (!gameFieldService.solvedPuzzle()) {
            System.out.println("Noch nicht gelöst");
            gameFieldService.printField();
            try {
                i = Integer.parseInt(buffer.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (i){
                case 0:
                    gameFieldService.shiftLine(true, 0, -1);
                    break;
                case 1:
                    gameFieldService.shiftLine(true, 0, 1);
                    break;
                case 2:
                    gameFieldService.shiftLine(false, 0, -1);
                    break;
                case 3:
                    gameFieldService.shiftLine(false, 0, 1);
                    break;
                default:
                    System.out.println("Falsche Eingabe");


            }
        }



        System.out.println(gameFieldService.solvedPuzzle());
        gameFieldService.printBacktracking();


*/
    }
}
