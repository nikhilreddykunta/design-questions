package com.scaler.lld.tictactoe.models;

import com.scaler.lld.tictactoe.strategies.PlayingStrategy;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder(toBuilder = true)
public class Bot extends Player {

    private PlayingStrategy playingStrategy;

    @Override
    public Move play(Board board) {
        return playingStrategy.play(board);
    }

}
