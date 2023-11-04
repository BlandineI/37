public class mymethods {// creates a public class mymethods
    public static int addnumbers(int num1, int num2) {//declares the public function addnumbers
        return num1+num2; // returns the sum of two numbers

}
    public static void main(String[] args) {//declares the main method
        int number1 = 5;//initializes the variable number1 to 5
        int number2 = 7;//initializes the variable number2 to 7
        int result= addnumbers(number1, number2);// calculates the sum
        System.out.println("the sum of " + number1 + " and "+ number2 +" is: " + result);//prints the result
    }//ends the main method
}//ends the public class
