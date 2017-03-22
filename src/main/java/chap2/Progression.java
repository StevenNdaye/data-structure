package chap2;

public class Progression {
    protected long current;

    public Progression(long current) {
        this.current = current;
    }

    public Progression() {
        this(0);
    }

    public long nextValue() {
        long answer = current;

        advance();

        return answer;
    }

    protected void advance() {
        current++;
    }

    void printProgression() {
        System.out.println(nextValue());
        for (int i = 1; i < 10; i++) {
            System.out.println(" " + nextValue());
        }
        System.out.println();
    }
}
