package com.chess;

import com.boardgame.Board;
import com.boardgame.Piece;
import com.boardgame.Position;

public abstract class ChessPiece extends Piece {
    private Color color;
    private int moveCount;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount(){
        this.moveCount++;
    }

    public void decreaseMoveCount(){
        this.moveCount--;
    }

    protected ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return  p != null && p.getColor() != color;
    }

}
