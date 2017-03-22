package chap2;

/**
 * Created by stevenndaye on 2017/03/21.
 */
public class FibonacciProgression extends Progression {

    protected long prev;

    public FibonacciProgression() {
        this(0, 1);
    }

    public FibonacciProgression(long first, long second) {
        super(first);
        prev = second - first;
    }

    protected void advance() {
        long temp = prev;
        prev = current;
        current += temp;
    }

}
