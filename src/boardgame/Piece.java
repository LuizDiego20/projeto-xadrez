package boardgame;

import javax.swing.text.StyledEditorKit.BoldAction;

public abstract class Piece {
    protected Position position;
    private Board board;

    Piece(){
    }

    public Piece(Board board) {
        this.position = null;
        this.board = board;
    }

    protected Board getBoard() {
        return board;
    }

    public abstract Boolean[][] possibleMoves();

    public Boolean possibleMove(Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public Boolean isThereAnyPossibleMove(){
        Boolean[][] mat = possibleMoves();
        for(int x = 0;x<mat.length;x++){
            for(int y = 0;y<mat.length;y++){
                if(mat[x][y]){
                    return true;
                }
            }
        }
        return false;
    }

}
