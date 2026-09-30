package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public Boolean[][] possibleMoves() {
        Boolean[][] mat = new Boolean[getBoard().getRows()][getBoard().getColumns()];

        //initializing the matrix with false, since Boolean is not a primitive type
        for (int i = 0; i < getBoard().getRows(); i++) {
            for (int j = 0; j < getBoard().getColumns(); j++) {
                mat[i][j] = false;
                 }
            }



        return mat;
    }
    
}
