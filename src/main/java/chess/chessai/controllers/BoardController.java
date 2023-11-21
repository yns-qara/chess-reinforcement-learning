package chess.chessai.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class BoardController implements Initializable {

    @FXML
    public GridPane gridPane;

    @FXML
    public Pane a1;
    @FXML
    public AnchorPane anchorPane;


    private ArrayList<String> letters;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        letters = new ArrayList<>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("d");
        letters.add("e");
        letters.add("f");
        letters.add("g");
        letters.add("h");


        for (Node node : gridPane.getChildren()) {
            node.addEventHandler(MouseEvent.MOUSE_CLICKED, this::mouseEntered);
        }
    }


    @FXML
    private void mouseEntered(MouseEvent e) {
        Node source = (Node) e.getSource();

        Integer colIndex = GridPane.getColumnIndex(source);
        Integer rowIndex = GridPane.getRowIndex(source);

        System.out.println(letters.get(colIndex - 1) + " " + (8 - rowIndex + 1));


    }


}
