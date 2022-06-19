import java.util.Arrays;

public class FindMaximum<M extends Comparable<M>> {
    // Constant variables
    private final M VARIABLE1;
    private final M VARIABLE2;
    private final M VARIABLE3;
    private final M VARIABLE4;
    private final M VARIABLE5;


    // Constructor

    public FindMaximum(M variable1, M variable2, M variable3, M variable4, M variable5) {
        this.VARIABLE1 = variable1;
        this.VARIABLE2 = variable2;
        this.VARIABLE3 = variable3;
        this.VARIABLE4 = variable4;
        this.VARIABLE5 = variable5;
    }

    // Method by using generics
    public static <M extends Comparable<M>> M testMaximum(M variable1, M variable2, M variable3, M variable4, M variable5) {

        M max = variable5;
        // comparing numbers using compareTo method.
        if (variable1.compareTo(variable2) > 0 && variable1.compareTo(variable3) > 0 && variable1.compareTo(variable4) > 0 && variable1.compareTo(max) > 0) {
            max = variable1;
        } else if (variable2.compareTo(variable1) > 0 && variable2.compareTo(variable3) > 0 && variable2.compareTo(variable4) > 0 && variable2.compareTo(max) > 0) {
            max = variable2;
        } else if (variable3.compareTo(variable1) > 0 && variable3.compareTo(variable2) > 0 && variable3.compareTo(variable4) > 0 && variable3.compareTo(max) > 0) {
            max = variable3;
        } else if (variable4.compareTo(variable1) > 0 && variable4.compareTo(variable2) > 0 && variable4.compareTo(variable3) > 0 && variable4.compareTo(max) > 0) {
            max = variable4;
        } else {
            max = variable5;
        }
        return max;
    }

    public static void main(String[] args) {
        //displaying welcome message
        System.out.println(" Find Maximum Number using Generics ");

        //creating object and finding maximum integer number
        FindMaximum objectInteger = new FindMaximum(1, 2, 3, 4, 5);
        objectInteger.testMaximum();
        System.out.println(" ");

        //finding maximum float number
        FindMaximum objectFloat = new FindMaximum(1.1, 1.2, 1.3, 1.4, 1.5);
        objectFloat.testMaximum();
        System.out.println(" ");

        //finding maximum string length
        FindMaximum objectString = new FindMaximum("manoj", "sandeep", "rani", "hari", "sujatha");
        objectString.testMaximum();
    }


    // Creating print maximum function

    public M testMaximum() {
        M findMax = FindMaximum.testMaximum(VARIABLE1, VARIABLE2, VARIABLE3, VARIABLE4, VARIABLE5);
        printMax(findMax); //calling printMaximum method.
        return findMax;
    }

    public void printMax(M max) {
        System.out.println("\nMAXIMUM IS :- " + max);
    }
}
