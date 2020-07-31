package labs_examples.datatypes_operators.examples;

/*
   Compute the number of cubic inches
   in 1 cubic mile.
*/
class Inches {
    public static void main(String args[]) {
        long ci;
        long im;

        im = 5280 * 12;

        ci = im * im * im;

        System.out.println("There are " + ci +
                " cubic inches in cubic mile.");

    }
}

// Data structures and algorithms, store the data(databases)
// Networking, Operating systems, how the internet works
// June calls