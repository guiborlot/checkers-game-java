package application;

import checkers.CheckersMatch;
import java.util.Scanner;
import checkers.CheckersPiece;
import checkers.CheckersPosition;
import java.util.InputMismatchException;
import checkers.CheckersException;


public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CheckersMatch checkersMatch = new CheckersMatch();

        while(true) {
            try {
                UI.clearScreen();
                UI.printBoard(checkersMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                CheckersPosition source = UI.readCheckersPosition(sc);

                boolean[][] possibleMoves = checkersMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(checkersMatch.getPieces(), possibleMoves);

                System.out.println();
                System.out.print("Target: ");
                CheckersPosition target = UI.readCheckersPosition(sc);

                CheckersPiece capturedPiece = checkersMatch.performCheckersMove(source, target);
            } catch (CheckersException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}