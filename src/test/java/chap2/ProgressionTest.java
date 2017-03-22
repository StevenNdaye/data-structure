package chap2;

import org.junit.Test;

public class ProgressionTest {

    @Test
    public void shouldPrintProgression() {
        Progression progression = new Progression();
        progression.printProgression();
    }

    @Test
    public void shouldTestArithmeticProgression() throws Exception {
        Progression arithmeticProgression = new ArithmeticProgression(4, 0);
        arithmeticProgression.printProgression();
    }

    @Test
    public void shouldTestGeometricProgression() throws Exception {
        Progression geometricProgression = new GeometricProgression(3, 1);
        geometricProgression.printProgression();
    }

    @Test
    public void shouldTestFibonacciProgression() throws Exception {
        Progression fibonacciProgression = new FibonacciProgression(0, 1);
        fibonacciProgression.printProgression();
    }
}
