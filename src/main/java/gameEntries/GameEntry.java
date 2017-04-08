package gameEntries;

public class GameEntry {
    private int score;
    private String name;


    public GameEntry(int score, String name) {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "GameEntry{" +
                "score=" + score +
                ", name='" + name + '\'' +
                '}';
    }
}
