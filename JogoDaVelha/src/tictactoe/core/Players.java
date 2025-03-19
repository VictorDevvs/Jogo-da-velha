package tictactoe.core;

import java.util.ArrayList;
import java.util.List;

public class Players {

    private final List<Symbol> players = new ArrayList<>(2);
    private int currentyPlayerIndex = -1;

    public Players(){
        players.add(Symbol.X);
        players.add(Symbol.O);
    }

    public Symbol next(){
        currentyPlayerIndex = (currentyPlayerIndex + 1) % players.size();
        return players.get(currentyPlayerIndex);
    }
}
