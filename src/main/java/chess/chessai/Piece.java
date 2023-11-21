package chess.chessai;

import java.util.Objects;

public class Piece {
    protected Boolean color, active;
    protected String currentCoordinates, name;


    public String move(String piece, String destination) {
        String position = Objects.equals(piece, "pawn") ? destination : (piece + destination);
        setCurrentCoordinates(position);
        return this.currentCoordinates;
    }

    public String take(String destination, String depart) {
        return this.currentCoordinates;
    }

    public void setCurrentCoordinates(String currentCoordinates) {
        this.currentCoordinates = currentCoordinates;
    }

    public String getCurrentCoordinates() {
        return currentCoordinates;
    }
}
