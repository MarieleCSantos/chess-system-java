package chess;

import boardgame.Board;
import boardgame.Piece;
import lombok.Getter;

@Getter
public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

//    public Color getColor() {
//        return color;
//    } foi substituído pela anotação do lombok
}
