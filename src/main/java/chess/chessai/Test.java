package chess.chessai;

public class Test {
    public static void main(String[] args) {
        Piece pawn = new Piece();
        pawn.move("K", "c2");
        System.out.println(pawn.getCurrentCoordinates());
        pawn.move("pawn", "c2");
        System.out.println(pawn.getCurrentCoordinates());

        Pawn pawn2 = new Pawn();

        System.out.println(pawn2.move("b", "3"));

        System.out.println(pawn2.take("b", "c", 4));


        System.out.println(pawn2.promote("b", 7, 'Q'));

    }

}
