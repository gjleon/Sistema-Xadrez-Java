package com.chess;

import com.boardgame.BoardException;

public class ChessException extends BoardException {
    private  static final long serialVersionUID = 1L;

    public ChessException(String message) {
        super(message);
    }
}
