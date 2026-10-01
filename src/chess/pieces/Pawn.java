package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{

    public Pawn(Board board, Color color) {
        super(board, color);
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

        Position p = new Position(0, 0);

        if(getColor() == Color.WHITE){

            //up
            p.setValues(position.getRow() - 1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow() - 1, position.getColumn());
            Position p2 = new Position(position.getRow() - 1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0){
                mat[p.getRow()][p.getColumn()] = true;
            }

            //upper-left
            p.setValues(position.getRow() - 1, position.getColumn() - 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            //upper-right
            p.setValues(position.getRow() - 1, position.getColumn() + 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
        }
        else{
            //up
            p.setValues(position.getRow() + 1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            p.setValues(position.getRow() + 1, position.getColumn());
            Position p2 = new Position(position.getRow() + 1, position.getColumn());
            if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0){
                mat[p.getRow()][p.getColumn()] = true;
            }

            //upper-left
            p.setValues(position.getRow() + 1, position.getColumn() - 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }

            //upper-right
            p.setValues(position.getRow() + 1, position.getColumn() + 1);
            if(getBoard().positionExists(p) && isThereOpponentPiece(p)){
                mat[p.getRow()][p.getColumn()] = true;
            }
        }

        return mat;
    }

    @Override
    public String toString() {
        return "P";
    }
    
}
