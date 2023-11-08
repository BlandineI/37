// program to print 10 numbers but stops if the number is equal to 3
public class break1 {  // Declares a public class calles break1 

public static void main(String[] args) {  // shows the main method
    //using for loop  
    for(int i=1;i<=10;i++){   // Declares the loop to iterate from 1 to 10
        if(i==3){  // Checks if the number is equal to 3
              
            break;  //breaking the loop
        }  // ends if statement
        System.out.println(i);   //prints the numbers 
    }   // ends for loop
}  // ends the main method
}  // ends the break1 class
