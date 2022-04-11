package org.codance;

/**
 * @author zhaoxg
 * @date 2022/4/11 11:46
 */
public class SquarePegAdapt extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapt(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double sqrt = Math.sqrt((Math.pow((peg.getWidth() / 2), 2)) * 2);
        System.out.println(sqrt);
        return sqrt;
    }
}
