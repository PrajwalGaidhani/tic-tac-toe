package com.example.tictactoe.strategies;


import com.example.tictactoe.model.Board;
import com.example.tictactoe.model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

    void undoMove(Move lastMove);
}