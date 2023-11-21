package chess.chessai;

public class Pawn extends Piece {


    public String move(String nextFile, int nextRank) {
        /*
        * this case will be treated in the method that calls this one.
         threat the case where the pawns are on the second rank
        * threat the normal case
        * */
        setCurrentCoordinates(nextFile + nextRank);
        return this.currentCoordinates;

    }

    public String take(String currentFile, String nextFile, int nextRank) {

        setCurrentCoordinates(currentFile + "X" + (nextFile + nextRank));
        return this.currentCoordinates;
    }

    public String promote(String currentFile, int currentRank, char promoteTo) {
        // return the promotion notation
        setCurrentCoordinates(currentFile + (currentRank + 1) + promoteTo);
        return this.currentCoordinates;
    }
}
