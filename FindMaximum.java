import java.util.Arrays;

public class FindMaximum {

    public static void main(String[] args) {
        //displaying welcome message
        System.out.println(" Find Maximum Number using Generics ");

        System.out.println("Maximum values of integer is :- " + findMaximum(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("Maximum values of float is :- " + findMaximum(1.1, 1.2, 1.3, 1.4, 1.5));
        System.out.println("Maximum length of string is :- " + findMaximum("manoj", "sander", "rani", "hari"));

    }

    //using array method to print more numbers
    public static <M> M findMaximum(M... a) {
        Arrays.sort(a);
        return a[a.length - 1];
    }

}
