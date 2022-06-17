public class FindMaximum {
    public static void main(String[] args) {
        //displaying welcome message
        System.out.println(" Find Maximum Number using Generics ");

        //creating object and finding maximum integer number
        FindMaximum object = new FindMaximum();
        object.integerMax(48, 24, 38);   //test case 1.1 maximum number at position 1
        object.integerMax(28, 56, 24);   //test case 1.2 maximum number at position 2
        object.integerMax(24, 34, 54);   //test case 1.3 maximum number at position 3

        //finding maximum float number
        object.floatMax(5.2f, 2.5f, 3.1f);  //test case 1.1 maximum number at position 1
        object.floatMax(2.2f, 7.2f, 4.5f);  //test case 1.1 maximum number at position 2
        object.floatMax(1.1f, 2.3f, 4.5f);  //test case 1.1 maximum number at position 3

    }

    //method to find maximum integer number
    public void integerMax(Integer number1, Integer number2, Integer number3) {
        //comparing numbers using compare to method
        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0) {
            System.out.println(number1 + " Is Maximum ");
        } else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0) {
            System.out.println(number2 + " Is Maximum ");
        } else {
            System.out.println(number3 + " Is Maximum ");
        }
    }

    //method to find maximum float number
    public void floatMax(Float number1, Float number2, Float number3) {
        if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0) {
            System.out.println("test case 1.1 " + number1 + " Is Maximum at position 1");
        } else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0) {
            System.out.println("test case 1.2 " + number2 + " Is Maximum at position 2");
        } else {
            System.out.println("test case 1.3" + number3 + " Is Maximum at position 3");
        }
    }

}
