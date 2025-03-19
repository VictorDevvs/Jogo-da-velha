package tictactoe.core;

import tictactoe.util.ValidationUtil;
import java.util.Objects;

public record Coord(int i, int j) {

    public Coord {
        ValidationUtil.require(i >= 0 && i < Board.SIZE, "i is out of range");
        ValidationUtil.require(j >= 0 && j < Board.SIZE, "j is out of range");
    }

    public static Coord parse(String text){
        Objects.requireNonNull(text);

        String[] tokens = text.split(",");

        if (tokens.length != 2){
            throw new IllegalArgumentException("Invalid format");
        }

        try {
            return new Coord(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("Invalid number");
        }
    }
}
