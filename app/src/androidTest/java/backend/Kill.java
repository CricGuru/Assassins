package backend;
import java.time.LocalDateTime;
import java.util.Date;

public class Kill {
    private Player assassin;
    private Player victim;
    private Loc location;
    private LocalDateTime datetime;

    public Kill(Player p1, Loc location, LocalDateTime dt) {
        this.assassin = null;
        this.victim = p1;
        this.location = location;
        this.datetime = dt;
    }

    public Kill(Player p1, Player p2, Loc location, LocalDateTime dt) {
        this.assassin = p1;
        this.victim = p2;
        this.location = location;
        this.datetime = dt;
    }

    public void updateKill(Player p1) {
        if (this.assassin.equals(null)) {
            this.assassin = p1;
        }

        else {
            throw new UnsupportedOperationException("Kill already has a confirmed killer");
        }
    }

}
