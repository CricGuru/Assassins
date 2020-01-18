package backend;

class Player {

    private String name;
    private boolean alive;
    private Player target;

    public Player(String s) {
        this.name = name;
    }

    public void setAlive(boolean p) {
        this.alive = p;
    }

    public boolean getAlive() {
        return alive;
    }

    public void setTarget(Player p) {
        this.target = p;
    }

    public Player getTarget(Player p) {
        return target;
    }

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

}
