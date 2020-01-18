package backend;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Game {

    Map<Player, Boolean> list_players;
    boolean started;

    // Construct the game, a bit like starting a new server
    public Game() {
        list_players = new HashMap<Player, Boolean>();
        started = false;
    }

    // Start the game
    public void start() {
        started = true;
        List<Player> li = new LinkedList<Player>(list_players.keySet());
        List<Player> li2 = new LinkedList<Player>(li);
        Collections.shuffle(li);
        for (int i = 0; i < li.size(); i++) {
            li.get(i).setTarget(li2.get(i));
        }
    }

    public void addPlayer(String name) {
        list_players.put(new Player(name), true);
    }

}
