package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;
import lombok.Getter;

@Getter
public abstract class ChessPiece extends Piece {
    private Color color;
    @Getter
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

//    public Color getColor() {
//        return color;
//    } foi substituído pela anotação do lombok

    public void increaseMoveCount() {
        moveCount++;
    }

    public void decreaseMoveCount() {
        moveCount--;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereAnOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
