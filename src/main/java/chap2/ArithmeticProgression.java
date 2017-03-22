package chap2;

/**
 * Created by stevenndaye on 2017/03/21.
 */
public class ArithmeticProgression extends Progression {
    protected long increment;

    public ArithmeticProgression() {
        this(1, 0);
    }

    public ArithmeticProgression(long stepSize, int start) {
        super(start);
        increment = stepSize;
    }

    public ArithmeticProgression(long stepSize) {
        this(stepSize, 0);
    }

    @Override
    protected void advance() {
        current += increment;
    }
}
