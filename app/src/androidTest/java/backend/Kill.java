package backend;
import java.time.LocalDateTime;
import java.util.Date;

public class Kill {
    private Player assassin;
    private Player victim;
    private Loc location;
    private LocalDateTime datetime;

    public Kill(Player p1, Player p2, Loc location, LocalDateTime dt) {
        this.assassin = p1;
        this.victim = p2;
        this.location = location;
        this.datetime = dt;
    }
}
