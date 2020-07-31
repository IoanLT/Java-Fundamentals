package labs_examples.datatypes_operators.labs;

/**
 * Please demonstrate the use of all logical operators below. These include:
 *
 * AND, short-circuit AND, OR, short-circuit OR, XOR, NOT
 *
 */
class LogicalOperators {

    public static void main(String[] args) {

        // example of "OR"
//        boolean a = true;
//        boolean b = false;
//        if (a | b){
//            System.out.println("a or b is true");
//        }

        // example of "short-circuit OR"
//        boolean a = true;
//        boolean b = false;
//        if (a || b){
//            System.out.println("a is true so the whole expression is true regarless of what value b has");
//        }

        // example of "AND"
//        int a = 1;
//        int b = 2;
//        if(a == 1 & b < 5) System.out.println("This expression is true");

        // example of "short-circuit AND"
//        int a = 2;
//        int b = 1;
//        if(a == 1 && b < 5) System.out.println("a == 1 is false so the whole expression is false");

        // example of "!"
//        boolean a, b, c = true;
//        boolean d = false;
//        if (!(a & b || c & d)) System.out.println("! switches the expression true to false");

        // example of "XOR"
        boolean x = false;
        boolean y = false;
        if (x ^ y) System.out.println("Expression is false");

    }

}

