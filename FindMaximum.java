public class FindMaximum {
    public static void main(String[] args) {
        //displaying welcome message
        System.out.println(" Find Maximum Number using Generics ");

        //creating object and finding maximum integer number
        FindMaximum object = new FindMaximum();
        object.findMaximum(48, 24, 38);   //test case 1.1 maximum number at position 1
        object.findMaximum(28, 56, 24);   //test case 1.2 maximum number at position 2
        object.findMaximum(24, 34, 54);   //test case 1.3 maximum number at position 3
        System.out.println(" ");

        //finding maximum float number
        object.findMaximum(5.2f, 2.5f, 3.1f);  //test case 1.1 maximum number at position 1
        object.findMaximum(2.2f, 7.2f, 4.5f);  //test case 1.1 maximum number at position 2
        object.findMaximum(1.1f, 2.3f, 4.5f);  //test case 1.1 maximum number at position 3
        System.out.println(" ");

        //finding maximum string length
        object.findMaximum("Zam", "Manoj", "Sandeep");
        object.findMaximum("Sandeep", "Zam", "Manoj");
        object.findMaximum("Manoj", "Sandeep", "Zam");

    }
    //method to find maximum by using generics
    public <M extends Comparable <M>> M findMaximum(M variable1,M variable2,M variable3){
        M max =variable3;

        //comparing numbers using compare to method
        if (variable1.compareTo(variable2)>0&&variable1.compareTo(max)>0){
            max=variable1;
            System.out.println("test case 1.1 :- "+max+" Is Maximum ");
        } else if (variable2.compareTo(variable1)>0&&variable2.compareTo(max)>0) {
            max=variable2;
            System.out.println("test case 1.2 :- "+max+" Is Maximum ");
        }else {
            max=variable3;
            System.out.println("test case 1.3 :- "+max+" Is Maximum ");
        }
        return max;
    }

}
