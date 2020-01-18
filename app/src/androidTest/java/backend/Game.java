package backend;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Game {

    List<Player> list_players;
    List<Kill> list_kills;
    boolean started;
    int number_alive;

    // Construct the game, a bit like starting a new server
    public Game() {
        list_players = new LinkedList<Player>();
        list_kills = new LinkedList<Kill>();
        started = false;
    }

    // Start the game
    public void start() {
        number_alive = list_players.size();
        started = true;

        List<Player> li = new LinkedList<Player>(list_players);
        Collections.shuffle(li);
        for (int i = 0; i < li.size(); i++) {
            li.get(i).setTarget(list_players.get(i));
        }
    }

    public void addPlayer(String name) {
        list_players.add(new Player(name));
    }

    // Make a given player dead
    public void killPlayer(Player p) {
        p.setAlive(false);
    }

    public void registerKill(Player assassin, Player victim, Loc location) {
        Kill k = new Kill(assassin, victim, location, LocalDateTime.now());
        list_kills.add(k);

        Player winner = null;
        if (number_alive == 1) {
            for (Player p : list_players) {
                if (p.getAlive()) {
                    win(winner);
                }
            }
        }
    }

    public void win(Player winner) {
        System.out.println(winner.getName() + " wins!");
    }

}
