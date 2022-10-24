package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null;  //quando a peça é criada ela tem posiçao nula
    }

    protected Board getBoard() {
        return board;
    }
}
