public class FindMaximum<M extends Comparable<M>> {

    M variable1;
    M variable2;
    M variable3;

    public FindMaximum(M variable1, M variable2, M variable3) {
        this.variable1 = variable1;
        this.variable2 = variable2;
        this.variable3 = variable3;
    }

    public static void main(String[] args) {
        //displaying welcome message
        System.out.println(" Find Maximum Number using Generics ");

        //creating object and finding maximum integer number
        findMaximum(48, 24, 38);
        System.out.println(" ");

        //finding maximum float number
        findMaximum(5.2f, 2.5f, 3.1f);
        System.out.println(" ");

        //finding maximum string length
        findMaximum("Zam", "Manoj", "Siva");

    }

    //method to find maximum by using generics
    public static <M extends Comparable<M>> M findMaximum(M variable1, M variable2, M variable3) {
        M max = variable3;

        //comparing numbers using compare to method
        if (variable1.compareTo(variable2) > 0 && variable1.compareTo(max) > 0) {
            max = variable1;
            System.out.println(max + " :- Is Maximum ");
        } else if (variable2.compareTo(variable1) > 0 && variable2.compareTo(max) > 0) {
            max = variable2;
            System.out.println(max + " :- Is Maximum ");
        } else {
            max = variable3;
            System.out.println(max + " :- Is Maximum ");
        }
        return max;
    }

}
