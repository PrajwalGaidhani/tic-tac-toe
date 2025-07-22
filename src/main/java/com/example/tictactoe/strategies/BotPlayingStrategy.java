package com.example.tictactoe.strategies;

import com.example.tictactoe.model.Board;
import com.example.tictactoe.model.Move;
import com.example.tictactoe.model.Player;

public interface BotPlayingStrategy {
    public Move makeMove(Board board, Player player);
}