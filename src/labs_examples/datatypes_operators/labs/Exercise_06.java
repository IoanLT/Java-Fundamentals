package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // A cylinder's volume is π * r² * h, and its surface area is 2π * r * h + 2π r²
        System.out.println(getVol(3.14, 5.0));
        System.out.println(getSurf(3.14, 5.0));
    }

    public static double getVol (double r, double h){
        double volume = 3.14 * Math.pow(r, r) * h;
        return volume;
    }

    public static double getSurf (double r, double h){
        double surface = (2 * 3.14) * r * h + (2 * 3.14 * Math.pow(r, r));
        return surface;
    }
}