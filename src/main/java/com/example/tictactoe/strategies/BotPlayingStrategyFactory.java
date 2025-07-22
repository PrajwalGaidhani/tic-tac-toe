package com.example.tictactoe.strategies;


import com.example.tictactoe.model.BotDiffcultyLevel;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getStrategy(BotDiffcultyLevel botDiffcultyLevel) {
        if(botDiffcultyLevel.equals(BotDiffcultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        }
        return null;
    }
}