package boardgame;

public class Piece {
    protected Position positoin;
    private Board board;

    Piece(){
    }

    public Piece(Board board) {
        this.positoin = null;
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

}
