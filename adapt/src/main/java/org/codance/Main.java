package org.codance;

/**
 * @author zhaoxg
 * @date 2022/4/11 15:10
 */
public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if (roundHole.fits(roundPeg)) {
            System.out.println("半径为5的圆钉适合半径为5的圆孔");
        }
        SquarePegAdapt smallSquarePegAdapt = new SquarePegAdapt(new SquarePeg(2));
        SquarePegAdapt largeSquarePegAdapt = new SquarePegAdapt(new SquarePeg(8));
        if (roundHole.fits(smallSquarePegAdapt)) {
            System.out.println("边长为2的方钉适合直径为5的圆孔");
        }
        if (roundHole.fits(largeSquarePegAdapt)) {
            System.out.println("边长为8的方钉适合直径为5的圆孔");
        }
    }
}
