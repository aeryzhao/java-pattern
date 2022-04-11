package org.codance;

/**
 * @author zhaoxg
 * @date 2022/4/11 11:38
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public boolean fits(RoundPeg roundPeg){
        return this.radius >= roundPeg.getRadius();
    }
}
