package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8,8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
        for(int r = 0;r < board.getRows();r++){
            for(int c = 0;c < board.getColumns();c++){
                mat[r][c] = (ChessPiece) board.piece(r, c);
            }
        }
        return mat;
    }

    private void placeNewPiece(Character column, Integer row, ChessPiece piece){
        board.placePiece(piece, new ChessPosition(column, row).toPositon());
    }

        private void initialSetup() {
        placeNewPiece('a', 1, new Rook(board, Color.WHITE));
        placeNewPiece('h', 1, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new King(board, Color.WHITE));
        placeNewPiece('a', 7, new Rook(board, Color.BLACK));
        placeNewPiece('h', 7, new King(board, Color.BLACK));
        placeNewPiece('e', 7, new King(board, Color.BLACK));

    }
}
