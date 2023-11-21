module chess.chessai {
    requires javafx.controls;
    requires javafx.fxml;


    opens chess.chessai to javafx.fxml;
    exports chess.chessai;
    exports chess.chessai.controllers;
}