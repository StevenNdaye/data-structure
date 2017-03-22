package chap2;

/**
 * Created by stevenndaye on 2017/03/21.
 */
public class GeometricProgression extends Progression {
    private long base;

    public GeometricProgression(long base, long start) {
        super(start);
        this.base = base;
    }

    public GeometricProgression() {
        this(2, 1);
    }

    public GeometricProgression(long base) {
        this(base, 1);
    }

    protected void advance() {
        current *= base;
    }
}
